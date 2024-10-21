/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest_anggitrefiyan_2311103142;

/**
 *
 * @author Asus
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ManajemenTaman {
    ArrayList<Tanaman> daftarTanaman = new ArrayList();
    String[] daftarTanaman = {"sawi", "tomat", "cabe"};
    
    Scanner scanner = new Scanner(System.in);
    char tambahTanaman;
    
    Public void tambahTanaman(){
        System.out.print("Masukkan nama Tanaman: ");
        String namaItem = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan jenis Tanaman: ");
        String jenis = scanner.nextLine();
    }
}
