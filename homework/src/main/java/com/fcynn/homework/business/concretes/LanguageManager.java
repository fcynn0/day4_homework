package com.fcynn.homework.business.concretes;

import com.fcynn.homework.business.abstracts.LanguageService;
import com.fcynn.homework.dataAccess.abstracts.LanguageRepository;
import com.fcynn.homework.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage language) {
        List<ProgrammingLanguage> programmingLanguages=languageRepository.getAll();
        for (ProgrammingLanguage language1:programmingLanguages){
            if (language1.getName().equals(language.getName()) ||language.getName().isBlank()){
                throw new RuntimeException("programlama dili girilemez");

            }
        }

        languageRepository.add(language);

    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);

    }

    @Override
    public void update(int id, String name) {
        List<ProgrammingLanguage> programmingLanguages=languageRepository.getAll();
        for (ProgrammingLanguage language:programmingLanguages){
            if (language.getName().equals(name) || name.isBlank()){
                throw  new RuntimeException("Programlama dili girilemez");
            }
        }

        languageRepository.update(id,name);

    }
}
