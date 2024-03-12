package com.exercise;
import java.util.Scanner;
import java.text.DecimalFormat;
// Keliling lingkaran dengan diketahui diameter = 10.

public class Sircle {
    public static void main(String[] args){
        final double phi = 3.14;
        double keliling, d, luas, r;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Masukkan diameter lingkaran : ");
        d = input.nextDouble();

        r = d / 2;
        luas = phi * r * r;
        keliling = phi * d;
        System.out.println("phi x r^2 = Luas\n" + 3.14 + "x " + r + "^2 = " + df.format(luas));
        System.out.print("phi x d = Keliling\n" + 3.14 + " x " + d + " = " + df.format(keliling));
    }
}
