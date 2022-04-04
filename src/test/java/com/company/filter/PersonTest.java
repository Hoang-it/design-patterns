package com.company.filter;

import com.company.enums.TypeGender;
import com.company.enums.TypeMaterial;
import com.company.interfaces.Criteria;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", TypeGender.MALE.name(), TypeMaterial.SINGLE.name()));
        persons.add(new Person("John", TypeGender.MALE.name(), TypeMaterial.MARRIED.name()));
        persons.add(new Person("Laura", TypeGender.FEMALE.name(), TypeMaterial.SINGLE.name()));
        persons.add(new Person("Diana", TypeGender.FEMALE.name(), TypeMaterial.MARRIED.name()));
        persons.add(new Person("Mike", TypeGender.FEMALE.name(), TypeMaterial.SINGLE.name()));
        persons.add(new Person("Bobby", TypeGender.MALE.name(), TypeMaterial.MARRIED.name()));

        Criteria male = new CriterialMale();
        Criteria female = new CriterialFemale();
        Criteria single = new CriterialSingle();
        Criteria maleAndSingle = new AndCriterial(male, single);
        Criteria maleOrSingle = new OrCriterial(male, single);

        System.out.println("Male: " + male.meetCriteria(persons));
        System.out.println("Female: " + female.meetCriteria(persons));
        System.out.println("Single: " + male.meetCriteria(persons));
        System.out.println("Male single: " + maleAndSingle.meetCriteria(persons));
        System.out.println("Male and single: " + maleOrSingle.meetCriteria(persons));
    }
}