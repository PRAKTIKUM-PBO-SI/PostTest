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
public class ManajemenTanaman {
    Tanaman[] daftarTanaman;
    int jumlahTanaman;
    
    
    public ManajemenTanaman(int kapasitas) {
        daftarTanaman = new Tanaman[kapasitas];
        jumlahTanaman = 0;
    }

    public void tambahTanaman(Tanaman item) {
        daftarTanaman[jumlahTanaman] = item;
        jumlahTanaman++;
    }
    
    public void tampilkanSemuaTanaman() {
        int c = 1;
        System.out.println("Daftar Tanaman:");
        for (int i = 0; i < jumlahTanaman; i++) {
            System.out.println("================");
            System.out.println("Tanaman ke: " + c);
            daftarTanaman[i].tampilkanData();
            c++;
        }  
    }
}
