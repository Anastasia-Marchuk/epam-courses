package com.epam.brest.model;

public class DepartmentDto {

    private Integer departmentId;
    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId=departmentId;
    }

    public DepartmentDto(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return null;
    }

    public DepartmentDto() {

    }

    public Number getAvgSalary() {
        Integer avg;
        return null;
    }
}
