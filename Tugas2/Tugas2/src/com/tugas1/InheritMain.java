package com.tugas1;

public class InheritMain {
    public static void main(String[] args) {
        Student mahasiswa = new Student();
        mahasiswa.nim = "13020180000";
        mahasiswa.Identity("Iqbal", "Malang");
        String nim = mahasiswa.getNIM();
        System.out.println(nim);
    }
}
