/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tokoparfum;
import com.mycompany.tokoparfum.KebutuhanToko.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TokoParfum {
    public static void main(String[] args) {
        List<Parfum> daftarParfum = new ArrayList<>();
       JenisParfum  tokoParfum = new JenisParfum ("Toko Wangi Wangi");

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Parfum");
            System.out.println("2. Edit Parfum");
            System.out.println("3. Hapus Parfum");
            System.out.println("4. Lihat Daftar Parfum");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Parfum: ");
                    String nama = input.next();
                    System.out.print("Harga: ");
                    double harga = input.nextDouble();
                    Parfum parfum = new Parfum(nama, harga);
                    tokoParfum.tambahParfum(parfum);
                    break;

                case 2:
                    System.out.print("Index Parfum yang akan diedit: ");
                    int indexEdit = input.nextInt();
                    if (indexEdit >= 0 && indexEdit < tokoParfum.getJumlahParfum()) {
                        System.out.print("Nama Parfum baru: ");
                        nama = input.next();
                        System.out.print("Harga baru: ");
                        harga = input.nextDouble();
                        tokoParfum.editParfum(indexEdit, new Parfum(nama, harga));
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Index Parfum yang akan dihapus: ");
                    int indexHapus = input.nextInt();
                    if (indexHapus >= 0 && indexHapus < tokoParfum.getJumlahParfum()) {
                        tokoParfum.hapusParfum(indexHapus);
                    } else {
                        System.out.println("Index tidak valid.");
                    }
                    break;

                case 4:
                    tokoParfum.lihatDaftarParfum();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}