package com.codingtree.app.rest.Controller;

import com.codingtree.app.rest.Models.Student;
import com.codingtree.app.rest.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping(value = "/students")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @PostMapping(value = "/add")
    public String addStudent(@RequestBody Student student) {
        studentRepo.save(student);
        return "Student is successfully saved";
    }

    @PutMapping(value = "/update/{id}")
    public String updateStudent(@PathVariable long id, @RequestBody Student student) {
        Student updatedStudent = studentRepo.findById(id).get();
        updatedStudent.setFirstName(student.getFirstName());
        updatedStudent.setLastName(student.getLastName());
        updatedStudent.setAge(student.getAge());
        studentRepo.save(updatedStudent);
        return "Data for student id: " + id + " have been updated";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        Student deleteStudent = studentRepo.findById(id).get();
        studentRepo.delete(deleteStudent);
        return "Student with the id: " + id + " has been removed";
    }
}
