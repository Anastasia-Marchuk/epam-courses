package com.epam.brest.dao;


import com.epam.brest.model.DepartmentDto;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentDtoDaoJdbc implements DepartmentDtoDao {


    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    @Value("${department.findAllWithAvgSalary}")
//    private String findAllWithArgSalarySql;

    private String findAllWithArgSalarySql= "Select td.department_id as departmentId, td.department_name as departmentName," +
            "tavg(e.salary) as avgSalary" +
            "FROM tdepartment" +
            "LEFT JOIN employee e ON td.department_id=e.department_id " +
            "GROUP BY td.department_id, td.department_name" +
            "ORDER BY tdepartment_name";

    public DepartmentDtoDaoJdbc (NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        this.namedParameterJdbcTemplate=namedParameterJdbcTemplate;
    }


    @Override
    public List<DepartmentDto> findAllWithAvgSalary() {
        List<DepartmentDto> departments = namedParameterJdbcTemplate.query(findAllWithArgSalarySql,
                BeanPropertyRowMapper.newInstance(DepartmentDto.class));
        return departments;
    }
}
