package com.epam.brest.dao;

import com.epam.brest.model.DepartmentDto;

import java.util.List;

public interface DepartmentDao {

    List<DepartmentDto> findAll();

    Integer create (DepartmentDto department);
    Integer update (DepartmentDto department);
    Integer delete (Integer departmentid);
}
