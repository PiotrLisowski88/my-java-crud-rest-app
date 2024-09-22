package com.codingtree.app.rest.Controller;

import com.codingtree.app.rest.Models.Students;
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
    public List<Students> getStudents() {
        return studentRepo.findAll();
    }

    @PostMapping(value = "/add")
    public String addStudent(@RequestBody Students students) {
        studentRepo.save(students);
        return "Students is successfully saved";
    }

    @PutMapping(value = "/update/{id}")
    public String updateStudent(@PathVariable long id, @RequestBody Students students) {
        Students updatedStudents = studentRepo.findById(id).get();
        updatedStudents.setFirstName(students.getFirstName());
        updatedStudents.setLastName(students.getLastName());
        updatedStudents.setAge(students.getAge());
        studentRepo.save(updatedStudents);
        return "Data for students id: " + id + " have been updated";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        Students deleteStudents = studentRepo.findById(id).get();
        studentRepo.delete(deleteStudents);
        return "Students with the id: " + id + " has been removed";
    }
}
