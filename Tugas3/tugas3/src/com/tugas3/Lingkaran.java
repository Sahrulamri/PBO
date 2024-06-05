package com.tugas3;

public class Lingkaran {
    private int radius;
    private static final double PI = 3.14;

    public Lingkaran(int radius) {
        this.radius = radius;
    }

    public double getLuas() {
        return radius * radius * PI;
    }

    public double getKeliling() {
        return 2 * PI * radius;
    }

    public int getRadius() {
        return radius;
    }
}
