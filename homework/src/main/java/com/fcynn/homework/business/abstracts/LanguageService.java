package com.fcynn.homework.business.abstracts;

import com.fcynn.homework.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();
    public ProgrammingLanguage getById(int id);
    public void add(ProgrammingLanguage language);
    public void delete(int id);
    public void  update(int id,String name);


}
