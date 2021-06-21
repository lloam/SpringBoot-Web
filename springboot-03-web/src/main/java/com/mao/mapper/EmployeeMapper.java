package com.mao.mapper;

import com.mao.pojo.Department;
import com.mao.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao
@Repository
@Mapper
public interface EmployeeMapper {


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
