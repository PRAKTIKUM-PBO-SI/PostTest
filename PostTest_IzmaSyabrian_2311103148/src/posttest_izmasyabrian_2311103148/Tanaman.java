/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_izmasyabrian_2311103148;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class Tanaman {
    String nama;
    String jenis;
    int jumlah;
    String atributTanaman;
    
    public Tanaman(String nama, int jumlah, String jenis, String atribut){
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.atributTanaman = atribut;
    }
    
    public void tampilkanData() {
        System.out.println("Nama Tanaman: "+nama);
        System.out.println("Jumlah Tanaman: "+jumlah);
        System.out.println("Jenis Tanaman: "+jenis);
        System.out.println("Atribut Lain: "+atributTanaman);
        
    }
    
}
