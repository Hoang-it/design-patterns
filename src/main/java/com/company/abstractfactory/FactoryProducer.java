package com.company.abstractfactory;

public class FactoryProducer {
    public AbstractFactory factory(boolean rounded){
        if (rounded) return new RoundedFactory();
        return new ShapeFactory();
    }
}
