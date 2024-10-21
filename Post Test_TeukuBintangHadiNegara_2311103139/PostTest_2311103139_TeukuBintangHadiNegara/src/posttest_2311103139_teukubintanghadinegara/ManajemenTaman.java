/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103139_teukubintanghadinegara;

/**
 *
 * @author TeukuBintangHadiNegara / 2311103139
 */
public class ManajemenTaman {
    Tanaman[] tanaman;
    int jumlahTanaman;
    
    public ManajemenTaman(int kapasitas){
        tanaman = new Tanaman[kapasitas];
        jumlahTanaman = 0;
    }
    
    public void tambahTanaman(Tanaman item) {
        tanaman[jumlahTanaman] = item;
        jumlahTanaman++;
    }
    
    public void tampilkanSemuaTanaman(){
        System.out.println("Daftar Tanaman:");
        for (int i = 0; i < jumlahTanaman; i++) {
            tanaman[i].tampilkanData();
        }
    }
}
