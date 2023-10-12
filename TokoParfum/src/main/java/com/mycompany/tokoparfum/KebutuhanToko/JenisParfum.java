/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoparfum.KebutuhanToko;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class JenisParfum {
    private final String JenisParfum ;
    private ArrayList<Parfum> daftarParfum;

    public JenisParfum (String namaToko) {
        this.JenisParfum  = namaToko;
        this.daftarParfum = new ArrayList<>();
    }

    public void tambahParfum(Parfum parfum) {
        daftarParfum.add(parfum);
    }

    public void editParfum(int index, Parfum parfum) {
        daftarParfum.set(index, parfum);
    }

    public void hapusParfum(int index) {
        daftarParfum.remove(index);
    }

    public void lihatDaftarParfum() {
        System.out.println("Daftar Parfum di " + JenisParfum + ":");
        for (int i = 0; i < daftarParfum.size(); i++) {
            Parfum parfum = daftarParfum.get(i);
            System.out.println(i + ". Nama: " + parfum.getNama() + ", Harga: " + parfum.getHarga());
        }
    }

    public int getJumlahParfum() {
        return daftarParfum.size();
    }
}
    