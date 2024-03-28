package vn.edu.iuh.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.services.StudentServices;
import vn.edu.iuh.fit.services.StudentSubjectRegistration;
import vn.edu.iuh.fit.services.SubjectServices;

@Controller
@RequestMapping("/registrations")
public class StudentSubjectController {
    @Autowired
    private SubjectServices subjectServices;

    @Autowired
    private StudentServices studentServices;

    @Autowired
    private StudentSubjectRegistration studentSubjectRegistration;

    @GetMapping("")
    public String registration(Model model, @RequestParam long studentId) {
        model.addAttribute("studentId", studentId);
        model.addAttribute("subjects", subjectServices.findAll());
        model.addAttribute("registeredSubjects", studentServices.getAllResgisteredSubject(studentId));
        return "registration";
    }

    @PostMapping("/register")
    public String register(@RequestParam long studentId, @RequestParam long subjectId) {
        studentSubjectRegistration.register(studentId, subjectId);
        return "redirect:/registrations?studentId=" + studentId;
    }
}
