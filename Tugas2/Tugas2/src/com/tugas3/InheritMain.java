package com.tugas3;
import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student mahasiswa = new Student();
        
        System.out.print("Masukkan Nama: ");
        String name = input.nextLine();
        mahasiswa.setName(name);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        mahasiswa.setNIM(nim);

        System.out.print("Masukkan Hobi: ");
        String hobi = input.nextLine();
        mahasiswa.setHobi(hobi);

        System.out.print("Masukkan Alamat: ");
        String address = input.nextLine();
        mahasiswa.setAddress(address);

        System.out.print("Masukkan SPP: ");
        int spp = input.nextInt();
        mahasiswa.setSpp(spp);

        System.out.print("Masukkan SKS: ");
        int sks = input.nextInt();
        mahasiswa.setSks(sks);

        System.out.print("Masukkan Modul: ");
        int modul = input.nextInt();
        mahasiswa.setModul(modul);

        mahasiswa.Identity();

        System.out.println("Total pembayaran: " + mahasiswa.hitungPembayaran(spp, sks, modul));

        input.close();
    }
}