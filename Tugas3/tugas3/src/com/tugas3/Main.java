package com.tugas3;

import java.util.Scanner;

class Main {

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
=======
        System.out.println("\n=============Selamat datang di program Bangun Datar==================");
        System.out.println("\nMenghitung Luas dan keliling persegi");
>>>>>>> ccaf2d653d779fa45d97cd1eec1d895939de27ae
        System.out.print("Masukkan sisi persegi: ");
        int sisiPersegi = scanner.nextInt();
        Persegi persegi = new Persegi(sisiPersegi);
        System.out.println("Luas persegi: " + persegi.getLuas());
        System.out.println("Keliling persegi: " + persegi.getKeliling());

<<<<<<< HEAD
=======
        System.out.println("\n Menghitung Luas dan keliling segitiga");
>>>>>>> ccaf2d653d779fa45d97cd1eec1d895939de27ae
        System.out.print("Masukkan alas segitiga: ");
        int alasSegitiga = scanner.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggiSegitiga = scanner.nextInt();
        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
        System.out.println("Luas segitiga: " + segitiga.getLuas());
        System.out.println("Keliling segitiga: " + segitiga.getKeliling());

<<<<<<< HEAD
=======
        System.out.println("\n Menghitung Luas dan keliling lingkaran");
>>>>>>> ccaf2d653d779fa45d97cd1eec1d895939de27ae
        System.out.print("Masukkan jari-jari lingkaran: ");
        int jariJariLingkaran = scanner.nextInt();
        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
        System.out.println("Luas lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling lingkaran: " + lingkaran.getKeliling());

<<<<<<< HEAD
=======
        System.out.println("\n Menghitung Luas dan keliling persegi panjang");
        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        System.out.println("Luas persegi panjang: " + persegiPanjang.getLuas());
        System.out.println("Keliling persegi panjang: " + persegiPanjang.getKeliling());

>>>>>>> ccaf2d653d779fa45d97cd1eec1d895939de27ae
        scanner.close();
    }
}