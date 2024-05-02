package com.tugas3;

public class Student extends Person {
    protected String nim;
    protected int spp;
    protected int sks;
    protected int modul;


    public String getNIM() {
        return nim;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setModul(int modul) {
        this.modul = modul;
    }

    @Override
    public void Identity() {
        System.out.println("\t\t\t==================== HASIL DATA MAHASISWA ====================");
        super.Identity();
        System.out.println("NIM : " + getNIM());
    }

    public int hitungPembayaran(int spp, int sks, int modul){
        int total;
        total = spp + sks + modul;
        return total;
    }
}
