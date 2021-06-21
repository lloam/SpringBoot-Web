package com.mao.service;

import com.mao.pojo.Employee;

import java.util.Collection;

public interface EmployeeService {

    //增加一个员工
    public void save(Employee employee);
    //查询全部员工信息
    public Collection<Employee> getAllEmployee();
    //通过id查询员工
    public Employee getEmployeeById(Integer id);


    //删除员工通过id
    public void delete(Integer id);
    //更新员工
    int updateEmployee(Employee employee);
}
