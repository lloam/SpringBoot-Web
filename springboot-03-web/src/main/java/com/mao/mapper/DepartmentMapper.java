package com.mao.mapper;

import com.mao.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository
@Mapper
public interface DepartmentMapper {



    //获得所有部门信息
    public Collection<Department> getDepartments();

    //通过id得到部门
    public Department getDepartmentById(Integer id);

}
