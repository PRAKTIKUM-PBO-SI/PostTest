/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest_chrishotasirajagukguk_2311103126;

import java.util.Scanner;
/**
 *
 * @author Chris hotasi Rajagukguk
 */
public class PostTest_ChrisHotasiRajagukguk_2311103126 {
    public static void main(String[] args) {
        ManajemenStok manajemenStok = new ManajemenStok();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==== Menu Manajemen Stok Pakaian ====");
            System.out.println("1. Tambah Pakaian Pria");
            System.out.println("2. Tambah Pakaian Wanita");
            System.out.println("3. Tampilkan Semua Pakaian");
            System.out.println("4. Keluar");
            System.out.print("Pilih Opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> manajemenStok.tambahPakaianPria();
                case 2 -> manajemenStok.tambahPakaianWanita();
                case 3 -> manajemenStok.tampilkanSemuaBarang();
                case 4 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);
    }
}

    

