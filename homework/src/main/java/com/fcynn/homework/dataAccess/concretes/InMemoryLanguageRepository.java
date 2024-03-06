package com.fcynn.homework.dataAccess.concretes;

import com.fcynn.homework.dataAccess.abstracts.LanguageRepository;
import com.fcynn.homework.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<ProgrammingLanguage> languages;

    public InMemoryLanguageRepository() {
        languages=new ArrayList<ProgrammingLanguage>();
        languages.add(new ProgrammingLanguage(1,"C#"));
        languages.add(new ProgrammingLanguage(2,"Java"));
        languages.add(new ProgrammingLanguage(3,"Python"));

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return languages.get(id);
    }

    @Override
    public void add(ProgrammingLanguage language) {
        languages.add(language);

    }

    @Override
    public void delete(int id) {
        languages.remove(id);

    }

    @Override
    public void update(int id, String name) {
        ProgrammingLanguage upt=languages.get(id);
        upt.setName(name);

    }
}
