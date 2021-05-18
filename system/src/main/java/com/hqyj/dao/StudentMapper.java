package com.hqyj.dao;

import com.hqyj.entity.Student;

public interface StudentMapper {

    int deleteByPrimaryKey(String studentNumber);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentNumber);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}