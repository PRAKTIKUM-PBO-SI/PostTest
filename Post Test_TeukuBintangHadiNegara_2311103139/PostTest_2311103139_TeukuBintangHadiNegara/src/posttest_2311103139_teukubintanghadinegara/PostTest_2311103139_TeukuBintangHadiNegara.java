/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest_2311103139_teukubintanghadinegara;

import java.util.Scanner;

/**
 *
 * @author TeukuBintangHadiNegara / 2311103139
 */
public class PostTest_2311103139_TeukuBintangHadiNegara {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ManajemenTaman tanaman = new ManajemenTaman (10);
        char tambahTanaman = 0;
        int pilihan = 0;
        
        System.out.println("===Menu Manajemen Tanaman===");
        System.out.println("1. Tambah Bunga");
        System.out.println("2. Tambah Pohon");
        System.out.println("3. Tampilkan Semua Tanaman");
        System.out.println("4. Keluar");
        pilihan = scanner.nextInt();
        do{
            switch(pilihan){
                case 1:
                    System.out.print("Masukkan nama Bunga: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan jumlah Bunga: ");
                    int jumlah = scanner.nextInt();
                    System.out.print("Masukkan jenis Bunga: ");
                    String jenis = scanner.nextLine();
                    System.out.print("Masukkan warna Bunga: ");
                    String atributTanaman = scanner.nextLine();
                    scanner.nextLine();
                    Tanaman item = new Tanaman(nama, jumlah, jenis, atributTanaman);
                    tanaman.tambahTanaman(item);
                    System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
                    tambahTanaman = scanner.next().charAt(0);
                    scanner.nextLine();
                case 2 :
                    break;
                case 3 :
                    tanaman.tampilkanSemuaTanaman();
                case 4 :
                    break;
            }
        }while (tambahTanaman == 'y' || tambahTanaman == 'Y');
    }
}
