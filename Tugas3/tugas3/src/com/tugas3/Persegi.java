package com.tugas3;

public class Persegi extends BangunDatar{
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public int getSisi() {
        return this.sisi;
    }
}
