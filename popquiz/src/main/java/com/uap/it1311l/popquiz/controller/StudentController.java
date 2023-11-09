package com.uap.it1311l.popquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1311l.popquiz.model.Student;
import com.uap.it1311l.popquiz.model.Subject;
import com.uap.it1311l.popquiz.repository.StudentRepository;


@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/calculate")
	public Student calculateGrade(@RequestBody Student student) {
		studentRepository.insert(student);

        if (student.getAverageGrade() >= 85) 
            student.setComment("within the maintaining average");
        else
            student.setComment("For Improvement");

        return student;
	}
}
