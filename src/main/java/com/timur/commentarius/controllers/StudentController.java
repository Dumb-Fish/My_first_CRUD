package com.timur.commentarius.controllers;

import com.timur.commentarius.student.Student;
import com.timur.commentarius.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "commentarius")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/view")
    @ResponseBody
    public List<Student> viewStudents() {
        return studentService.getStudents();
    }

    @GetMapping
    public String getStudent(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @PostMapping
    @ResponseBody
    public Student registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
        return student;
    }

    @DeleteMapping(path="{studentId}")
    @ResponseBody
    public void deleteStudent(@PathVariable("studentId") int studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path="{studentId}")
    @ResponseBody
    public Student updateStudent(@PathVariable("studentId") int studentId,
                                 @RequestBody Student student) {
        studentService.updateStudent(studentId, student.getName(), student.getEmail());
        return student;
    }
}
