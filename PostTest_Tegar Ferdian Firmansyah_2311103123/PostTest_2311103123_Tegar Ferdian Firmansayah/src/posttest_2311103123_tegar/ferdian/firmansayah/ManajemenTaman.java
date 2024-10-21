/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103123_tegar.ferdian.firmansayah;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
public class ManajemenTaman {
    Tanaman[] daftarTanaman;
    int jumlahTanaman;
            
        public ManajemenTaman() {
        daftarTanaman = new Tanaman[100]; 
        jumlahTanaman = 0;
    }

    public void tambahTanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        Tanaman tanamanBaru = new Tanaman(nama, jumlah, jenis, atributTambahan);
        daftarTanaman[jumlahTanaman] = tanamanBaru;
        jumlahTanaman++;
    }

    public void tampilkanSemuaTanaman() {
        if (jumlahTanaman == 0) {
            System.out.println("Belum ada tanaman yang ditambahkan.");
        } else {
            for (int i = 0; i < jumlahTanaman; i++) {
                daftarTanaman[i].TampilkanData();
                System.out.println("=====================");
            }
        }
    }
}
       
