package com.company.filter;

import com.company.enums.TypeMaterial;
import com.company.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriterialSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person p : persons){
            if (TypeMaterial.SINGLE.name().equals(p.getMaterialStatus())) singlePersons.add(p);
        }
        return singlePersons;
    }
}
