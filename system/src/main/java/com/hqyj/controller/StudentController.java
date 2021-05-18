package com.hqyj.controller;

import com.hqyj.entity.Student;
import com.hqyj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/queryOne/{studentNumber}")
    @ResponseBody
    public Student queryOneById(@PathVariable("studentNumber") String studentId){
        return studentService.queryOneById(studentId);
    }
}
