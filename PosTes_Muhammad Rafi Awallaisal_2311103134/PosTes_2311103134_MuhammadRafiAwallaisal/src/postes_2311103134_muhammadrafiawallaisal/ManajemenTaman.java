/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postes_2311103134_muhammadrafiawallaisal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class ManajemenTaman {
    ArrayList<Tanaman> daftarTanaman = new ArrayList<>();

  
    public void tambahTanaman() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama tanaman: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan jumlah tanaman: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Masukkan jenis tanaman (Bunga/Pohon): ");
        String jenis = scanner.nextLine();

        // Atribut tambahan
        String atributTambahan = "";

        // Jika jenis tanaman adalah bunga, input warna
        if (jenis.equalsIgnoreCase("Bunga")) {
            System.out.print("Masukkan warna bunga: ");
            atributTambahan = scanner.nextLine(); // Input warna bunga
        }
        // Jika jenis tanaman adalah pohon, input tinggi
        else if (jenis.equalsIgnoreCase("Pohon")) {
            System.out.print("Masukkan tinggi pohon (dalam meter): ");
            atributTambahan = scanner.nextLine(); // Input tinggi pohon
        } else {
            System.out.println("Jenis tanaman tidak valid. Pilih Bunga atau Pohon.");
            return; 
        }

        Tanaman tanamanBaru = new Tanaman(nama, jumlah, jenis, atributTambahan);
        daftarTanaman.add(tanamanBaru);
        System.out.println("Tanaman berhasil ditambahkan!");
    }

    
    public void tampilkanSemuaTanaman() {
        if (daftarTanaman.isEmpty()) {
            System.out.println("Tidak ada tanaman dalam daftar.");
        } else {
            for (Tanaman tanaman : daftarTanaman) {
                tanaman.tampilkanData();
                System.out.println("------------------");
            }
 }
}
}