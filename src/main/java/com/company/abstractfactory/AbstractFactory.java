package com.company.abstractfactory;

import com.company.interfaces.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String type);
}
