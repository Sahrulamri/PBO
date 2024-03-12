package com.exercise;
import java.util.Scanner;

// Luas segitiga siku-siku dengan diketahui alas = 6, tinggi = 8.
public class Triangle {
    public static void main(String[] args){
        double a, t, l, k, c, akar;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas : ");
        a = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();

        l = 0.5 * a * t;
        akar = (a*a)+(t*t);
        c = Math.sqrt(akar);
        k = a + t + c;

        System.out.println("Luas segitiga : 1/2 x a x t \n\t\t\t" + "  : " + "1/2 x " + a + " x " + t + " \n \t\t\t  : " + l);
        System.out.println("Keliling segitiga : a + b + c \n\t\t\t" + "  : " + a + " + " + t + " + " + c + " \n \t\t\t  : " + k);
    }
}
