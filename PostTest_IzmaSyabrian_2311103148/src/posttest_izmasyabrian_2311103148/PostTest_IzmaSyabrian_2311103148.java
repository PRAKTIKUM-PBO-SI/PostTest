/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest_izmasyabrian_2311103148;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PostTest_IzmaSyabrian_2311103148 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenTanaman tanaman = new ManajemenTanaman(10); // Maksimal 10 tanaman
        char tambahTanaman;
        String nama;
        int jumlah;
        String atributLain;
        String jenis;
        int pilihMenu;
        
        do{
            System.out.println("==============================");
            System.out.println("=== Menu Manajemen Tanaman ===");
            System.out.println("1. Tambah Tanaman Bunga");
            System.out.println("2. Tambah Tanaman Pohon");
            System.out.println("3. Tampilkan Semua Tanaman");
            System.out.println("4. Keluar");
            System.out.println("Masukkan pilihan (1-4): ");
            pilihMenu = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihMenu) {
                case 1: 
                    System.out.println("=== Tambah Tanaman Bunga ===");
                    System.out.println("Masukkan nama bunga: ");
                    nama = scanner.nextLine();
                    System.out.println("Masukkan jumlah: ");
                    jumlah = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan atribut lain: ");
                    atributLain = scanner.nextLine();
                    jenis = "Bunga";
                    Tanaman itemB = new Tanaman(nama, jumlah, jenis, atributLain);
                    tanaman.tambahTanaman(itemB);
                    System.out.println("========================");
                    System.out.println("Data berhasil dimasukkan");
                    break;
                case 2:
                    System.out.println("=== Tambah Tanaman Pohon ===");
                    System.out.println("Masukkan nama Pohon: ");
                    nama = scanner.nextLine();
                    System.out.println("Masukkan jumlah: ");
                    jumlah = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan atribut lain : ");
                    atributLain= scanner.nextLine();
                    jenis = "Pohon";
                    Tanaman itemP = new Tanaman(nama, jumlah, jenis, atributLain);
                    tanaman.tambahTanaman(itemP);
                    System.out.println("========================");
                    System.out.println("Data berhasil dimasukkan");
                    break;
                case 3:
                    System.out.println("=== Daftar Tanaman ===");
                    tanaman.tampilkanSemuaTanaman();
                    break;
                case 4:
                    System.out.println("Anda Keluar");
                    break;
                default:
                    throw new AssertionError();
            }
        }while(pilihMenu != 4);
    }
}
