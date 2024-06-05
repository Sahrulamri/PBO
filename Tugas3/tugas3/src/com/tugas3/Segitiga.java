package com.tugas3;

class Segitiga extends BangunDatar {

    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return alas * tinggi / 2;
    }

    public double getKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getAlas() {
        return alas;
    }
}