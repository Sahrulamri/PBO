package com.tugas2;

public class Student extends Person {
    String nim;

    public String getNIM() {
        return nim;
    }

    @Override
    public void Identity() {
        System.out.println("NIM : " + getNIM());
    }
}
