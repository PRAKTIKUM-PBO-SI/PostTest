/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttestnajwa;
import java.util.ArrayList
/**
 *
 * @author asus
 */
public class ManajemenTaman {
    ArrayList <Tanaman> daftarTanaman = new ArrayList<>();
    
    
    public ManajemenTaman() {
        daftarTanaman = newArrayList<>();
   
    }
    
   // Method untuk menambahkan tanaman

    public void tambahTanaman(Tanaman item) {
        daftarTanaman.tambah(tanamanBaru);
    }
    // Method untuk menampilkan semua tanaman

    public void tampilkanTanaman() {
        System.out.println("Daftar Tanaman:");
        for (int i = 0; i < daftarTanaman; i++) {
            daftarTanaman[i].tampilkanTanaman();
        }
        System.out.println("Total Tanaman:  " + daftarTanaman);
    }
    
}
