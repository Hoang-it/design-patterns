package com.company.proxy;

import com.company.interfaces.Image;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {

    @Test
    void display() {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        image.display();
    }
}