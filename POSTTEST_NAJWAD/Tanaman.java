/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttestnajwa;

/**
 *
 * @author asus
 */
public class Tanaman {
    Tanaman tanaman;
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
    public void tampilkanTanaman(){
 System.out.println("Daftar Tanaman "+tanaman.nama+tanaman.jumlah+ tanaman.jenis+tanaman.atributTambahan);
 }
}
    
   