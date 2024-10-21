/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103123_tegar.ferdian.firmansayah;
/**
 *
 * @author Tegar Ferdian(2311103123)
 */
public class Tanaman {
    String nama, jenis, atributTambahan, tanamanBaru;
    int jumlah;
    
    public Tanaman(String nama, int jumlah, String jenis, String atributTanaman){
        this.nama = nama;
        this.jenis = jenis;
        this.atributTambahan = atributTanaman;
        this.jumlah = jumlah;
        this.tanamanBaru = tanamanBaru;
    }
    
    public void TampilkanData(){
        System.out.println("Nama Tanaman :" + nama);
        System.out.println("Jenis :" + jenis);
        System.out.println("Atribut Tambahan :" + atributTambahan);
        System.out.println("Tanaman Baru :" + tanamanBaru);
    }
    
    }

