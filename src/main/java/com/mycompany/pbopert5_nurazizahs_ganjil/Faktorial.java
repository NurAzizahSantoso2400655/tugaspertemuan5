/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert5_nurazizahs_ganjil;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Faktorial {

    static long hitungFaktorial(int n) {
        long hasil = 1;

        for (int i = n; i >= 1; i--) {
            hasil = hasil * i;
        }
        return hasil;
    }

    static void tampilFaktorial(int n) {
        System.out.print(n + "!=");

        if (n == 0) {
            System.out.print("1");
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print("*");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        long hasil = hitungFaktorial(n);

        tampilFaktorial(n);
        System.out.println("=" + hasil);
    }
}
