/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttestshahifah;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * S1SI07C
 */
public class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String atributTambahan;
    
        public Tanaman (String nama, int jumlah, String jenis, String atributTambahan){
            this.nama = nama;
            this.jumlah = jumlah;
            this.jenis = jenis;
            this.atributTambahan = atributTambahan;
            
        }
        public void tampilkanData(){
             System.out.println ("Nama tanaman : "+ nama + ", Jumlah : "+ jumlah +", Jenis : "+ jenis +"," + atributTambahan);
        }

}
