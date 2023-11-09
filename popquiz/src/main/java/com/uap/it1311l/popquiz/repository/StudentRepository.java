package com.uap.it1311l.popquiz.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uap.it1311l.popquiz.model.Student;
import com.uap.it1311l.popquiz.model.Subject;



@Mapper
public interface StudentRepository {
	
	@Insert("INSERT INTO student_info(studentNumber, studentName) VALUES (#{studentNumber}, #{studentName},"
			+ "INSERT INTO subject_ratings (subjectCode, subjectName, subjectGrade) VALUES (#{subjectCode}, #{subjectName}, #{subjectGrade})" )
	public int insert(@Param("student") Student student);
}