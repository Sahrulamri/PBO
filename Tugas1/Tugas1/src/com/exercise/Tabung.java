package com.exercise;
import java.util.Scanner;
import java.text.DecimalFormat;

// Volume tabung dengan diketahui diameter = 5, tinggi = 10.

public class Tabung {
    public static void main(String[] args){
        double d, v, t, r, luasPerm;
        final double phi = 3.14;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Masukkan diameter tabung : ");
        d = input.nextDouble();
        System.out.print("Masukkan tinggi tabung : ");
        t = input.nextDouble();

        r = d / 2;
        luasPerm = phi * r * r;
        v = luasPerm * t;

        System.out.println("Total Volume : luas alas x tinggi\n \t\t\t : " + df.format(v));


    }
}
