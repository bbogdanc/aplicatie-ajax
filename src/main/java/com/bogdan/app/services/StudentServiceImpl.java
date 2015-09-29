package com.bogdan.app.services;

import com.bogdan.app.DAO.StudentDAO;
import com.bogdan.app.core.Student;

import java.util.List;

/**
 * Created by bbaloi on 02.09.2015.
 */
public class StudentServiceImpl implements StudentService {

    StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public Student getStudentById(Integer id) {
        return studentDAO.getStudentById(id);
    }

    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }
}
