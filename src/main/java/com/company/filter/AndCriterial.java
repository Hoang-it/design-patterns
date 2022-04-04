package com.company.filter;

import com.company.interfaces.Criteria;

import java.util.List;

public class AndCriterial implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public AndCriterial(Criteria _criteria1, Criteria _criteria2){
        this.criteria1 = _criteria1;
        this.criteria2 = _criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria1.meetCriteria(persons);
        return criteria2.meetCriteria(persons);
    }
}
