package com.bogdan.app.core;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by bbaloi on 28.07.2015.
 */
@Entity
@Table(name="Students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="S_ID",nullable = false)
    private int studentId;

    @Column(name = "Username")
    private String userName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "FatherInitial")
    private String fatherInitial;

    @Column(name = "Password")
    private String password;

    public Student() {

    }

    public Student(int studentId, String password, String fatherInitial, String lastName, String userName, String firstName) {
        this.studentId = studentId;
        this.password = password;
        this.fatherInitial = fatherInitial;
        this.lastName = lastName;
        this.userName = userName;
        this.firstName = firstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherInitial() {
        return fatherInitial;
    }

    public void setFatherInitial(String fatherInitial) {
        this.fatherInitial = fatherInitial;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
