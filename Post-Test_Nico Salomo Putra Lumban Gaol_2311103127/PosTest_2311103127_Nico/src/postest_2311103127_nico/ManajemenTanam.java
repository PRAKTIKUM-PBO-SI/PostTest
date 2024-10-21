/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_2311103127_nico;

/**
 *
 * @author LENOVO
 *
 */
@SuppressWarnings("empty-statement")
public class ManajemenTanam {

    Tanaman[] daftarTanaman;
    int jumlahTanaman;

    public ManajemenTanam() {
        daftarTanaman = new Tanaman[200];
        jumlahTanaman = 0;
    }

    public void tambahTanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        Tanaman tanamanBaru = new Tanaman(nama, jumlah, jenis, atributTambahan);
        daftarTanaman[jumlahTanaman] = tanamanBaru;
        jumlahTanaman++;
    }

    public void tampikanSemuaTanaman() {
        if (jumlahTanaman == 0){
        System.out.println("Belum ada tanaman yang ditambahkan.");
    } else {
    for (int c = 0; c < jumlahTanaman; c++) {
            daftarTanaman[c].tampilkanData();
            System.out.println();
        }
    }
}
}
