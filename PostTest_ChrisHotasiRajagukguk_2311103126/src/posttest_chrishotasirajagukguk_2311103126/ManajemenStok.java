/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_chrishotasirajagukguk_2311103126;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManajemenStok {
    ArrayList<Pakaian> daftarPakaian = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void tambahPakaianPria() {
        System.out.print("Masukkan nama pakaian pria: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan model pakaian: ");
        String model = scanner.nextLine();

        Pakaian pakaianPria = new Pakaian(nama, jumlah, harga, "Pria", model);
        daftarPakaian.add(pakaianPria);
        System.out.println("==================================");
        System.out.println("Pakaian pria berhasil ditambahkan!\n");
    }

    public void tambahPakaianWanita() {
        System.out.print("Masukkan nama pakaian wanita: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan bahan pakaian: ");
        String bahan = scanner.nextLine();

        Pakaian pakaianWanita = new Pakaian(nama, jumlah, harga, "Wanita", bahan);
        daftarPakaian.add(pakaianWanita);
        System.out.println("==================================");
        System.out.println("Pakaian wanita berhasil ditambahkan!\n");
    }

    public void tampilkanSemuaBarang() {
        if (daftarPakaian.isEmpty()) {
            System.out.println("Tidak ada pakaian yang terdaftar.\n");
        } else {
            for (Pakaian pakaian : daftarPakaian) {
                pakaian.tampilkanData();
            }
        }
    }
}

