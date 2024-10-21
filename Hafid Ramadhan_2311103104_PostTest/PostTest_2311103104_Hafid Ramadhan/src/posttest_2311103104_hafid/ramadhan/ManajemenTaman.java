/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103104_hafid.ramadhan;
import java.util.ArrayList;
/**
 * @author Hafid Ramadhan
 * 2311103104
 * SI07C
 */
public class ManajemenTaman {
    private ArrayList<Tanaman> daftarTanaman ;

    public ManajemenTaman() {
        daftarTanaman = new ArrayList<>();
    }

    public void tambahTanaman(Tanaman tanaman) {
        daftarTanaman.add(tanaman);
    }

    public void tampilkanSemuaTanaman() {
        for (Tanaman tanaman : daftarTanaman) {
            tanaman.tampilkanData();
            System.out.println();
        }
    }
}

