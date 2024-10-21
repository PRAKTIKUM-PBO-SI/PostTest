/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postest_2311103127_nico;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PosTest_2311103127_Nico {

    /**
     * @param args the command line arguments
     */
    
class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String atributTambahan;

    public Tanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }

    public void tampilkanData() {
        System.out.println("Nama Tanaman: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Jenis: " + jenis);
        System.out.println("Atribut Tambahan: " + atributTambahan);
    }
}

class ManajemenTaman {
    private Tanaman[] daftarTanaman;
    private int jumlahTanaman;

    public ManajemenTaman() {
        daftarTanaman = new Tanaman[100]; // Kapasitas maksimum 100 tanaman
        jumlahTanaman = 0;
    }

    public void tambahTanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        Tanaman tanamanBaru = new Tanaman(nama, jumlah, jenis, atributTambahan);
        daftarTanaman[jumlahTanaman] = tanamanBaru;
        jumlahTanaman++;
    }

    public void tampilkanSemuaTanaman() {
        if (jumlahTanaman == 0) {
            System.out.println("Belum ada tanaman yang ditambahkan.");
        } else {
            for (int i = 0; i < jumlahTanaman; i++) {
                daftarTanaman[i].tampilkanData();
                System.out.println("--------------------------");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenTanam manajementanam = new ManajemenTanam();
        int pilihan;

        while (true) {
            System.out.println("===== Menu Manajemen Taman =====");
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
                    ManajemenTanam.tambahTanaman(namaBunga, jumlahBunga, "Bunga", warnaBunga);
                    break;

                case 2:
                    System.out.print("Masukkan Nama Pohon: ");
                    String namaPohon = scanner.nextLine();
                    System.out.print("Masukkan Jumlah: ");
                    int jumlahPohon = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan Tinggi Pohon: ");
                    String tinggiPohon = scanner.nextLine();
                    ManajemenTanaman.tambahTanaman(namaPohon, jumlahPohon, "Pohon", tinggiPohon);
                    break;

                case 3:
                    manajementanam.tampilkanSemuaTanaman();
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
