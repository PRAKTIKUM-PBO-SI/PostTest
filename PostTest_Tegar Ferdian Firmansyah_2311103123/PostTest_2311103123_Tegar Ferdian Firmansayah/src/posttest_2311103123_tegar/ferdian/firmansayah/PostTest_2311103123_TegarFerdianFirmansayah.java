/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest_2311103123_tegar.ferdian.firmansayah;

import java.util.Scanner;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
public class PostTest_2311103123_TegarFerdianFirmansayah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenTaman manajemen = new ManajemenTaman();
        int pilihan;

        while (true) {
            System.out.println("Menu Manajemen Taman");
            System.out.println("1. Tambah Tanaman Bunga");
            System.out.println("2. Tambah Tanaman Pohon");
            System.out.println("3. Tampilkan Semua Tanaman");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Bunga: ");
                    String namaBunga = scanner.nextLine();
                    System.out.print("Masukkan Jumlah: ");
                    int jumlahBunga = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan Warna Bunga: ");
                    String warnaBunga = scanner.nextLine();
                    manajemen.tambahTanaman(namaBunga, jumlahBunga, "Bunga", warnaBunga);
                    break;

                case 2:
                    System.out.print("Masukkan Nama Pohon: ");
                    String namaPohon = scanner.nextLine();
                    System.out.print("Masukkan Jumlah: ");
                    int jumlahPohon = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan Tinggi Pohon: ");
                    String tinggiPohon = scanner.nextLine();
                    manajemen.tambahTanaman(namaPohon, jumlahPohon, "Pohon", tinggiPohon);
                    break;

                case 3:
                    manajemen.tampilkanSemuaTanaman();
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
   
