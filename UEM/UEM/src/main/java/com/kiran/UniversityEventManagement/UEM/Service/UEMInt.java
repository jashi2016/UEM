package com.kiran.UniversityEventManagement.UEM.Service;

import com.kiran.UniversityEventManagement.UEM.Model.Event;
import com.kiran.UniversityEventManagement.UEM.Model.Student;

import java.time.Instant;
import java.util.List;

public interface UEMInt {
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student updateStudnet(int id, String department);

    String deleteStudent(int id);

    Event addEvent(Event event);

    Event getEvent(int id);

    Event updateEvent(int id, Instant date);

    String deleteEvent(int id);
}
