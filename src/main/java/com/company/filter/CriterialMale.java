package com.company.filter;

import com.company.enums.TypeGender;
import com.company.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriterialMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person p: persons){
            if (TypeGender.MALE.name().equals(p.getGender())){
                malePersons.add(p);
            }
        }
        return malePersons;
    }
}
