package com.kiran.UniversityEventManagement.UEM.Controller;

import com.kiran.UniversityEventManagement.UEM.Model.Event;
import com.kiran.UniversityEventManagement.UEM.Model.Student;
import com.kiran.UniversityEventManagement.UEM.Service.UEMInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/uem")
public class UEMController {

    @Autowired
    UEMInt uemInt;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
       return uemInt.addStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return uemInt.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return uemInt.getStudent(id);
    }

    @PutMapping("/{id}/{department}")
    public Student updateStudent(@PathVariable("id") int id,@PathVariable("department") String department){
        return uemInt.updateStudnet(id,department);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return uemInt.deleteStudent(id);
    }

    @PostMapping("/addEvent")
    public Event addEvent(@RequestBody Event event){
        return uemInt.addEvent(event);
    }

    @GetMapping("/{id}")
    public Event getEvent(@PathVariable int id){
        return uemInt.getEvent(id);
    }

    @PutMapping("/{id}/{date}")
    public Event updateEvent(@PathVariable("id") int id,@PathVariable("date") Instant date){
        return uemInt.updateEvent(id,date);
    }

    @DeleteMapping("/{id}")
    public String deleteEvent(@PathVariable int id){
        return uemInt.deleteEvent(id);
    }
}
