/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_2311103127_nico;

/**
 *
 * @author LENOVO
 */
public class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String  atributTambahan;
    
    public Tanaman(String nama, int jumlah, String jenis, String atributTambahan) {
      this.nama = nama;
      this.jumlah = jumlah;
      this.jenis = jenis;
      this.atributTambahan = atributTambahan;
    }
    // Method untuk menampilkan informasi lengkap tanaman

    
    public void tampilkanData() {
        System.out.println(nama);
        System.out.println(jumlah);
        System.out.println(jenis);
        System.out.println(atributTambahan);
    }
}
        
            
          
    
