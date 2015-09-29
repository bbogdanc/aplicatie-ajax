package com.bogdan.app.services;

import com.bogdan.app.core.Student;

import java.util.List;

/**
 * Created by bbaloi on 02.09.2015.
 */
public interface StudentService {
    public Student getStudentById(Integer id);
    public List<Student> getStudents();
}
