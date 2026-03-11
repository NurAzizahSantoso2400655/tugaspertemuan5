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

public class hitungGanjil {

    static int jumlahGanjil(int awal, int akhir) {
        int hitung = 0;

        for (int i = awal; i <= akhir; i++) {
            if (i % 2 != 0) {
                hitung++;
            }
        }
        return hitung;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        int hasil = jumlahGanjil(batasAwal, batasAkhir);

        System.out.println("Banyak bilangan ganjil = " + hasil);
    }
}
