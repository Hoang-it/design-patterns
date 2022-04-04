package com.company.filter;

import com.company.interfaces.Criteria;

import java.util.List;

public class OrCriterial implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public OrCriterial(Criteria _criterial1, Criteria _criterial2){
        this.criteria1 = _criterial1;
        this.criteria2 = _criterial2;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria1.meetCriteria(persons);
        List<Person> secondCriteria = criteria2.meetCriteria(persons);

        for (Person p : secondCriteria){
            if (!firstCriteria.contains(p)){
                firstCriteria.add(p);
            }
        }
        return firstCriteria;
    }
}
