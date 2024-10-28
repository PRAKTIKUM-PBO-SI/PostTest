/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_chrishotasirajagukguk_2311103126;

/**
 *
 * @author Chris Hotasi Rajagukguk
 */
public class Pakaian {
    String nama;
    int jumlah;
    double harga;
    String jenis;
    String atributTambahan;

    public Pakaian(String nama, int jumlah, double harga, String jenis, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }

    public void tampilkanData() {
        System.out.println("Nama Pakaian: " + nama);
        System.out.println("Jumlah Stok: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Jenis: " + jenis);
        System.out.println("Atribut Tambahan: " + atributTambahan);
        System.out.println();
    }
}

