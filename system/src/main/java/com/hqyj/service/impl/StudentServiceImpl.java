package com.hqyj.service.impl;

import com.hqyj.dao.StudentMapper;
import com.hqyj.entity.Student;
import com.hqyj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryOneById(String studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }
}
