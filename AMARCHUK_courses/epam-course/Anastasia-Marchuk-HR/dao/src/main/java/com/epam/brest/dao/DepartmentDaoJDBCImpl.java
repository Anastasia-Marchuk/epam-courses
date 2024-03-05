package dao.src.main.java.com.epam.brest.dao;

import com.epam.brest.model.DepartmentDto;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoJDBCImpl implements com.epam.brest.dao.DepartmentDao {

    private NamedParameterJdbcTemplate namedParameterJDBCTemplate;

    private final String SQL_ALL_DEPARTMENTS="Select d.department_id, d.department_name from department d order by d.department_name";
    private final String SQL_CREATE_DEPARTMENT="Insert into department (department_name) values (:departmentName)";

    public DepartmentDaoJDBCImpl(DataSource dataSource) {
        this.namedParameterJDBCTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    @Override
    public List<DepartmentDto> findAll() {
//        logger.debug("DEBUG MESSAGE");

        return namedParameterJDBCTemplate.query(SQL_ALL_DEPARTMENTS, new DepartmentRowMapper());
    }

    @Override
    public Integer create(DepartmentDto department) {

        SqlParameterSource sqlParameterSource=new MapSqlParameterSource("departmentName", department.getDepartmentName().toUpperCase());
        KeyHolder keyHolder=new GeneratedKeyHolder();
        namedParameterJDBCTemplate.update(SQL_CREATE_DEPARTMENT, sqlParameterSource,keyHolder);
        return (Integer) keyHolder.getKey();
    }

    @Override
    public Integer update(DepartmentDto department) {
        return null;

    }

    @Override
    public Integer delete(Integer departmentid) {
        return null;
    }

    private class DepartmentRowMapper implements RowMapper<DepartmentDto> {


        @Override
        public DepartmentDto mapRow(ResultSet resultSet, int i) throws SQLException {
            DepartmentDto department=new DepartmentDto();
            department.setDepartmentId(resultSet.getInt("departmentId"));
            department.setDepartmentName(resultSet.getString("departmentName"));
            return department;
        }
    }
}
