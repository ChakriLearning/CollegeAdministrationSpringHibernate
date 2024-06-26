package com.college.student.repository;

import com.college.student.constant.StorageType;
import com.college.student.exception.ServerUnavailableException;
import com.college.student.exception.StudentNotFoundException;
import com.college.student.pojo.Student;

import java.rmi.StubNotFoundException;
import java.util.List;

//this is product interface
public interface StudentRepository {

    List<Student> listStudents(boolean withAssociations) throws ServerUnavailableException;   //display all student details

    void addStudent(Student student) throws ServerUnavailableException;  //adding student in list;

    Student deleteStudent(int rollNo) throws ServerUnavailableException;   //deleting specific student from list;

    Student updateStudentByRollNo(Student student) throws ServerUnavailableException, StudentNotFoundException;

    //update specific student by rollNo from list
    Student getStudentDataWithAssociations(int studentRollNo) throws ServerUnavailableException;

    boolean isExist(int rollNo) throws ServerUnavailableException;

    public boolean accept(StorageType storageType);
}
