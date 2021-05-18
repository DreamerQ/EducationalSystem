package com.hqyj.dao;

import com.hqyj.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(String teacherNumber);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String teacherNumber);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}