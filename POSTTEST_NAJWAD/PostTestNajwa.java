/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttestnajwa;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class PostTestNajwa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         daftarTanaman = new Tanaman[10];
        char tambahTanaman;
   // Perulangan untuk menambah pesanan
        do {
            System.out.print("Masukkan nama tanaman: ");
            String namaItem = scanner.nextLine();
            
            System.out.print("Masukkan jumlah tanaman: ");
            double totalTanaman = scanner.nextDouble();
            scanner.nextLine(); // Bersihkan buffer
            
            int jumlah;
            do {
                System.out.print("Masukkan jumlah tanaman: ");
                jumlah = scanner.nextInt();
                scanner.nextLine(); // Bersihkan buffer
                
                if (jumlah < 1 || jumlah > 10) {
                    System.out.println("Kategori tidak valid. Silahkan masukkan maksimal 10");
                }
            } while (jumlah < 1 || jumlah > 10);
            
            Tanaman item = new Tanaman(tanaman.nama, tanaman.jumlah, kategoriItem);
            tanaman.tambahPesanan(item);
            
            System.out.print("Apakah ingin menambah pesanan lagi? (y/n): ");
            tambahTanaman = scanner.next().charAt(0);
            scanner.nextLine(); // Bersihkan buffer
        } while (tambahTanaman == 'y' || tambahPesanan == 'Y');
