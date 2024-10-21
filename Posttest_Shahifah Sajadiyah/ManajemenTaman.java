/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttestshahifah;
import java.until.ArrayList;
/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * S1 SI 07 C
 */
public class ManajemenTaman {
    ArrayList <Tanamam> daftarTanaman;
    
    public ManajemenTaman (){
        daftarTanaman = new ArrayList <> ();
    }
    public void tambahTanaman( Tanaman tanamanBaru){
        daftarTanaman.tambah(tanamanBaru);
    }
    public void tampilkanTanaman(){
        for (tanaman : daftarTanaman);
    }
}

