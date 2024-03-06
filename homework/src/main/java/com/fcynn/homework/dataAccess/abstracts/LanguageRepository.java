package com.fcynn.homework.dataAccess.abstracts;

import com.fcynn.homework.entities.concretes.ProgrammingLanguage;

import java.security.PublicKey;
import java.util.List;

public interface LanguageRepository {
    List<ProgrammingLanguage> getAll();
    public ProgrammingLanguage getById(int id);
    public void add(ProgrammingLanguage language);
    public void delete(int id);
    public void update(int id,String name);


}
