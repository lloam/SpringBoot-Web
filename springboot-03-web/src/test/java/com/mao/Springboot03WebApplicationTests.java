package com.mao;

import com.mao.mapper.EmployeeMapper;
import com.mao.pojo.Department;
import com.mao.pojo.Employee;
import com.mao.pojo.User;
import com.mao.service.DepartmentService;
import com.mao.service.EmployeeService;
import com.mao.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Date;

@SpringBootTest
class Springboot03WebApplicationTests {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        Employee employeeById = employeeService.getEmployeeById(1001);
        System.out.println(employeeById);

    }
    @Test
    void test(){
        employeeService.save(new Employee(1006,"FF","F2196143404@qq.com",0,new Department(106,"体育部"),new Date()));
    }
    @Test
    void test2(){
        employeeService.delete(1006);
    }
    @Test
    void test3(){
        User user = userService.queryUser("李茂", "123456");
        System.out.println(user);
    }

}
