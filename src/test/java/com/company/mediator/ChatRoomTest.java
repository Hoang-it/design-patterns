package com.company.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatRoomTest {

    @Test
    void showMessage() {
        User robert = new User("Robert");
        User john = new User("john");

        robert.sendMessage("Hi! John");
        john.sendMessage("Hi! robert");
    }
}