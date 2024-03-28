package vn.edu.iuh.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.services.SubjectServices;

@Controller
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    public SubjectServices subjectServices;

    @GetMapping
    public String subjects(Model model){
        model.addAttribute("subjects", subjectServices.findAll());
        return "index";
    }
    @GetMapping("/create")
    public String createSubject(Model model){
        model.addAttribute("subject", new Subject());
        return "create-subject";
    }

    @PostMapping
    public String saveSubject(@ModelAttribute Subject subject){
        subjectServices.save(subject);
        return "redirect:/subjects";
    }


    @GetMapping("/edit")
    public String updateForm(Model model, @RequestParam long id){
        Subject subject = subjectServices.findSubjectById(id);
        model.addAttribute("subject", subject);
        return "update-subject";
    }

    @PostMapping("/update")
    public String updateSubject(@ModelAttribute Subject subject, @RequestParam long id){
        Subject subjectUpdate = subjectServices.findSubjectById(id);
        subjectUpdate.setName(subject.getName());
        subjectServices.save(subjectUpdate);
        return "redirect:/subjects";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam long id){
        subjectServices.delete(id);
        return "redirect:/subjects";
    }
}
