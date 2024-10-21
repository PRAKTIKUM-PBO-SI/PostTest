/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103111_riskavanydewi;

/**
 * @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */

// import java.util.ArrayList;

public class ManajemenTaman {
   // ArrayList<Tanaman> daftarTanaman = new ArrayList<>();
   Tanaman[] daftarTanaman;
   int jumlahTanaman;
    
    public ManajemenTaman(int kapasitas){
        daftarTanaman = new Tanaman[kapasitas];
        jumlahTanaman = 0;
    }
    
    public void tambahTanaman(Tanaman tanaman){
        daftarTanaman[jumlahTanaman] = tanaman;
        jumlahTanaman++;
    }
    
    public void tampilkanSemuaTanaman(){
        System.out.println("========================");
        for (int i = 0; i < jumlahTanaman; i++){
           System.out.println("Tanaman ke-" +i);
           daftarTanaman[i].tampilkanData();
           System.out.println("========================");
        }
    }
    
}
