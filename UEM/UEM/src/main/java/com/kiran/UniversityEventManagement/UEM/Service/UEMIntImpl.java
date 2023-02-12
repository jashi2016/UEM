package com.kiran.UniversityEventManagement.UEM.Service;

import com.kiran.UniversityEventManagement.UEM.Model.Event;
import com.kiran.UniversityEventManagement.UEM.Model.Student;
import com.kiran.UniversityEventManagement.UEM.Repository.EventRepository;
import com.kiran.UniversityEventManagement.UEM.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.util.List;

@Service
public class UEMIntImpl implements UEMInt{
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    EventRepository eventRepository;
    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    @ResponseBody
    public Student updateStudnet(int id, String department) {
        Student s = studentRepository.findById(id).get();
        s.setDepartment(department);
        return studentRepository.save(s);
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student with id "+id+" is deleted";
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEvent(int id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public Event updateEvent(int id, Instant date) {
        Event e = eventRepository.findById(id).get();
        e.setDate(date);
        return eventRepository.save(e);
    }

    @Override
    public String deleteEvent(int id) {
        eventRepository.deleteById(id);
        return "Event with id "+id+" is deleted";
    }
}
