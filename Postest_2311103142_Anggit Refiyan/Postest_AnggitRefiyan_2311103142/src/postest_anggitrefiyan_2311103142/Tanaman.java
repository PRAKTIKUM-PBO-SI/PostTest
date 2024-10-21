/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_anggitrefiyan_2311103142;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 07C
 */
public class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String atributTambahan; //warna atau tinggi

    public Tanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }
    
    public void tampilkanData(){
        System.out.println("Nama tanaman: ");
        System.out.println("Jumlah tanaman: ");
        System.out.println("Jenis tanaman: ");
        System.out.println("Attribut tambahan (warna,tinggi): ");
    }
    
}
