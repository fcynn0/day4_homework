package com.fcynn.homework;

import com.fcynn.homework.business.abstracts.LanguageService;
import com.fcynn.homework.business.concretes.LanguageManager;
import com.fcynn.homework.webApi.controller.LanguagesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }



}
