package com.fcynn.homework.webApi.controller;

import com.fcynn.homework.business.abstracts.LanguageService;
import com.fcynn.homework.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return languageService.getAll();

    }
    @GetMapping("/byid/{id}")
    public ProgrammingLanguage getById( @PathVariable int id){
        return languageService.getById(id);

    }
    @GetMapping("/add")
    public void add(ProgrammingLanguage language){
        languageService.add(language);
    }
    @GetMapping("/delete")
    public void delete(int id){
        languageService.delete(id);
    }
    @GetMapping("/update")
    public void update(int id,String name){
        languageService.update(id,name);
    }

}
