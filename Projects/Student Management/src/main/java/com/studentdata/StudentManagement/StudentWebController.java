package com.studentdata.StudentManagement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentWebController {

    private final StudentRepository repo;

    public StudentWebController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", repo.findAll());
        return "students"; // shows all students
    }

    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add";
    }

    @PostMapping("/add")
    public String saveStudent(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateStudentForm(@PathVariable int id, Model model) {
        Student student = repo.findById(id).orElseThrow();
        model.addAttribute("student", student);
        return "update";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}
