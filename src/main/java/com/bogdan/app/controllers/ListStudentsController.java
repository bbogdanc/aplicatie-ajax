package com.bogdan.app.controllers;

import com.bogdan.app.core.Student;
import com.bogdan.app.services.StudentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by bbaloi on 07.09.2015.
 */

@Controller
public class ListStudentsController {

    @Autowired
    StudentService studentService;

    private static final Logger logger = Logger.getLogger(InitController.class);

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public ModelAndView listStudentsPage() {

        logger.info("Printing student ");

        List<Student> students = studentService.getStudents();
        ModelAndView modelAndView = new ModelAndView("students");
        modelAndView.addObject("students", students);
        return modelAndView;
    }
}
