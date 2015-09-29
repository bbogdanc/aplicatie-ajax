package com.bogdan.app.controllers;

import com.bogdan.app.core.Student;
import com.bogdan.app.services.StudentService;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

/**
 * Created by bbaloi on 02.09.2015.
 */

@Controller
public class AjaxController {

    private static final Logger logger = Logger.getLogger(AjaxController.class);

    @Autowired
    StudentService studentService;

    @RequestMapping (value = "/listinfo",method = RequestMethod.GET)
    public @ResponseBody String getStudentInf(@RequestParam(value = "id") String id) throws IOException {
        logger.info("Getting data for the student with id: " + id);
        Student s = studentService.getStudentById(Integer.parseInt(id));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(s);

    }

}