/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postes_2311103134_muhammadrafiawallaisal;

/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class Tanaman {
    String nama;
    String jenis;
    int jumlah;
    String atributTambahan;
    
     public Tanaman(String nama, String jenis, int jumlah, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.atributTambahan = atributTambahan;
        this.jenis = jenis;
        
    }

    Tanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        
    }
      public void tampilkanData() {
        System.out.println(nama + " nama");
        System.out.println(jumlah + " jumlah");
        System.out.println(jenis + " jenis");
        if  (jenis.equalsIgnoreCase("bunga")){
            System.out.println("warna bunga" + atributTambahan);
        }else if (jenis.equalsIgnoreCase("pohon")){
            System.out.println("Tinggi pohon"+ atributTambahan);
        }
}
}
