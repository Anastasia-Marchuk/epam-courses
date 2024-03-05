package com.epam.brest;

import com.epam.brest.model.DepartmentDto;

import java.util.List;

public interface  DepartmentDtoService {

    List<DepartmentDto> findAllWithAvgSalary();

}
