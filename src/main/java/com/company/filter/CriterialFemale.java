package com.company.filter;

import com.company.enums.TypeGender;
import com.company.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriterialFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person p : persons){
            if (TypeGender.FEMALE.name().equals(p.getGender())) femalePersons.add(p);
        }
        return femalePersons;
    }
}
