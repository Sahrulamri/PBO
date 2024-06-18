package com.tugas3;

import java.util.Scanner;

class Main {

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        int sisiPersegi = scanner.nextInt();
        Persegi persegi = new Persegi(sisiPersegi);
        System.out.println("Luas persegi: " + persegi.getLuas());
        System.out.println("Keliling persegi: " + persegi.getKeliling());

        System.out.print("Masukkan alas segitiga: ");
        int alasSegitiga = scanner.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggiSegitiga = scanner.nextInt();
        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
        System.out.println("Luas segitiga: " + segitiga.getLuas());
        System.out.println("Keliling segitiga: " + segitiga.getKeliling());

        System.out.print("Masukkan jari-jari lingkaran: ");
        int jariJariLingkaran = scanner.nextInt();
        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
        System.out.println("Luas lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.getKeliling());

        scanner.close();
    }
}