package com.uap.it1311l.popquiz.model;

public class Student {
	int studentId;
	int studentNumber; 
	String studentName; 
	int subjectId;
	float averageGrade;
	String comment;
	
	public float getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(float averageGrade) {
		this.averageGrade = averageGrade;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
}
