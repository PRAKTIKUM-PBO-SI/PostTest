/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103111_riskavanydewi;

/**
 * @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */

public class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String atributTambahan;
    
    public Tanaman(String nama, int jumlah, String jenis, String atributTambahan){
        this.nama = nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }
    
    public void tampilkanData(){
        System.out.println("Nama Tanaman: " +nama);
        System.out.println("Jumlah: " +jumlah);
        System.out.println("Jenis: " +jenis);
        System.out.println("Atribut Tambahan: " +atributTambahan);
    }

}
