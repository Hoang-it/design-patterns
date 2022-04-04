package com.company.proxy;

import com.company.interfaces.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
