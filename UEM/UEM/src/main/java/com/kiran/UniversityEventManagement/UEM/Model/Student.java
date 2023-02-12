package com.kiran.UniversityEventManagement.UEM.Model;


import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int studentId;
    String lastName;
    String firstName;
    int age;
    String department;

    public Student() {
    }

    public Student(int studentId, String lastName, String firstName, int age, String department) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
