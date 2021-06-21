package com.mao.service;

import com.mao.mapper.EmployeeMapper;
import com.mao.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    //增加一个员工
    public void save(Employee employee){

        employeeMapper.save(employee);

    }
    //查询全部员工信息
    public Collection<Employee> getAllEmployee(){
        return employeeMapper.getAllEmployee();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employeeMapper.getEmployeeById(id);
    }


    //删除员工通过id
    public void delete(Integer id){
        employeeMapper.delete(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
