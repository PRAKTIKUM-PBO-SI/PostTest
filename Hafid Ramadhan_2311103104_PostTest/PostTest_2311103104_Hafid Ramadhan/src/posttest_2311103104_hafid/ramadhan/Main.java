/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest_2311103104_hafid.ramadhan;

import java.util.Scanner;

/**
 *
 * @author Hafid Ramadhan
 * 2311103104
 * SI07C
 */
public class Main {

    public static void main(String[] args) {
        ManajemenTaman manajemenTaman = new ManajemenTaman();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== Menu Manajemen Taman =====");
            System.out.println("===== Hafid Ramadhan =====");
            System.out.println("===== 2311103104 =====");
            System.out.println("1. Tambah Tanaman Bunga");
            System.out.println("2. Tambah Tanaman Pohon");
            System.out.println("3. Tampilkan Semua Tanaman");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    
                    System.out.print("Masukkan nama bunga: ");
                    String namaBunga = scanner.nextLine();
                    System.out.print("Masukkan jumlah bunga: ");
                    int jumlahBunga = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Masukkan warna bunga: ");
                    String warnaBunga = scanner.nextLine();
                    Tanaman bunga = new Tanaman(namaBunga, jumlahBunga, "Bunga", warnaBunga);
                    manajemenTaman.tambahTanaman(bunga);
                    break;

                case 2:
                    System.out.print("Masukkan nama pohon: ");
                    String namaPohon = scanner.nextLine();
                    System.out.print("Masukkan jumlah pohon: ");
                    int jumlahPohon = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Masukkan tinggi pohon: ");
                    String tinggiPohon = scanner.nextLine();
                    Tanaman pohon = new Tanaman(namaPohon, jumlahPohon, "Pohon", tinggiPohon);
                    manajemenTaman.tambahTanaman(pohon);
                    break;

                case 3:
                    manajemenTaman.tampilkanSemuaTanaman();
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
