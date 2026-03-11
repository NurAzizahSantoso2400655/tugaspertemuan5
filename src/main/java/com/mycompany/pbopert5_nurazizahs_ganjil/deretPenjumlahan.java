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

public class deretPenjumlahan {

    static int hitungDeret(int n) {
        int jumlah = 0;

        for (int i = 1; i <= n; i++) {
            jumlah = jumlah + i;
        }

        return jumlah;
    }

    static void tampilDeret(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);

            if (i < n) {
                System.out.print("+");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int hasil = hitungDeret(N);

        tampilDeret(N);
        System.out.println(" = " + hasil);
    }
}
