package com.company.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleObjectTest {

    @Test
    void getInstance() {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();
    }
}