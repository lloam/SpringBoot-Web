package com.mao.service;

import com.mao.pojo.Department;

import java.util.Collection;

public interface DepartmentService {
    //获得所有部门信息
    public Collection<Department> getDepartments();

    //通过id得到部门
    public Department getDepartmentById(Integer id);
}
