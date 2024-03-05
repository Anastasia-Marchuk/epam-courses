package com.epam.brest.dao;

import com.epam.brest.model.DepartmentDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(SpringExtension.class)
//@ContextConfiguration(locations={"classpath*:test-db.xml", "classpath*:test-jdbc-conf.xml"})
@ContextConfiguration(locations={"classpath*:test-db.xml"})
class DepartmentDaoJDBCImplTest {

//    private final Logger logger=LogManager.getLogger(DepartmentDaoJDBCImplTest.class.getNane());
//    private final Logger logger=LogManager.getLogManager().getLogger(DepartmentDaoJDBCImplTest.class);

    private dao.src.main.java.com.epam.brest.dao.DepartmentDaoJDBCImpl departmentDaoJDBC;

    public DepartmentDaoJDBCImplTest(@Autowired DepartmentDao departmentDaoJDBC){
        this.departmentDaoJDBC= (dao.src.main.java.com.epam.brest.dao.DepartmentDaoJDBCImpl) departmentDaoJDBC;
    }

    @Test
    void findAll() {
//        logger.debug("Execute test: findAll()");
        assertNotNull(departmentDaoJDBC);
        assertNotNull(departmentDaoJDBC.findAll());
    }

    @Test
    void create(){
        assertNotNull(departmentDaoJDBC);
        int departmentSizeBefore=departmentDaoJDBC.findAll().size();
        DepartmentDto department=new DepartmentDto("SECURITY 2");
        Integer newDepartmentId=departmentDaoJDBC.create(department);
        assertNotNull(newDepartmentId);
        assertEquals((int)departmentSizeBefore, departmentDaoJDBC.findAll().size()-1);

    }
//
//    @Test
//    void tryToCreateEqualsDepartments(){
//        assertNotNull(departmentDaoJDBC);
//        Department department= new Department("HR");
//        assertThrows(DuplicateKeyException.class, ()->){
//            departmentDaoJDBC.create(department);
//            departmentDaoJDBC.create(department);
//
//        });
//
//    }
}