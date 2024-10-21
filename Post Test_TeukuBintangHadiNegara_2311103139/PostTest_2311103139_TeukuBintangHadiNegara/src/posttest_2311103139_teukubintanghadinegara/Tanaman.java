/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103139_teukubintanghadinegara;

/**
 *
 * @author TeukuBintangHadiNegara / 2311103139
 */
public class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String atributTanaman;
    
    public Tanaman(String nama, int jumlah, String jenis, String atributTanaman) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.atributTanaman = atributTanaman;
    }
    
    public void tampilkanData() {
        System.out.println("Nama Tanaman : " + nama + "Jumlah Tanaman : " + jumlah +
                "Jenis Tanaman : " + jenis + "Warna Tanaman : " + atributTanaman);
    }
}
