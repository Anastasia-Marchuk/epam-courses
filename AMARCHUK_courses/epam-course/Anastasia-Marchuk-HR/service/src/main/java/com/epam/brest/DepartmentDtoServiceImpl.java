package com.epam.brest;

import com.epam.brest.dao.DepartmentDtoDao;
import com.epam.brest.model.DepartmentDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentDtoServiceImpl implements DepartmentDtoService{

    private final DepartmentDtoDao departmentDtoDao;

    public DepartmentDtoServiceImpl (DepartmentDtoDao departmentDtoDao) {
        this.departmentDtoDao=departmentDtoDao;
    }

//
//    @Override
//    public List<DepartmentDto> findallWithAvgSalary(){
//
//        return departmentDto.findAllWithAvgSalary();
//    }

    @Override
    public List<DepartmentDto> findAllWithAvgSalary() {
        return null;
    }
}
