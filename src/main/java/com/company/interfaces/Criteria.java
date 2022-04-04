package com.company.interfaces;

import com.company.filter.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
