package com.exercise;
import java.util.Scanner;

// Buatlah sebuah program Java yang akan menghasilkan output sebagai berikut.
//Fulan Marfulan silakan diganti dengan nama sendiri.
public class Biodata {
    public static void main(String[] args){
        String nama;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        nama = input.nextLine();

        System.out.println("Halo, nama saya adalah " + nama);
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program java");
    }
}
