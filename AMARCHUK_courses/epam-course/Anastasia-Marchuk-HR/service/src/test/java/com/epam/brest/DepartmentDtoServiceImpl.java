package com.epam.brest;


import com.epam.brest.model.DepartmentDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations={"classpath*:test-db.xml", "classpath*:service-context-test.xml"})
public class DepartmentDtoServiceImpl {

    @Autowired
    DepartmentDtoService departmentDtoService;

    @Test
    public void shouldFindAllWithAvgSalary() {
        List<DepartmentDto> departmens = departmentDtoService.findAllWithAvgSalary();
        assertNotNull(departmens);
        assertTrue(departmens.size()>0);
        assertTrue(departmens.get(0).getAvgSalary().intValue()>0);

    }


}
