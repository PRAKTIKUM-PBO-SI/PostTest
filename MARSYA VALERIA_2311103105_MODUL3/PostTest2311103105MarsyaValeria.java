/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2311103105marsyavaleria;
import java.util.Scanner;
/**
 *
 * @author MARSYA VALERIA
 * 2311103105
 * 7C
 */
public class PostTest2311103105MarsyaValeria {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Tanaman tanaman = new Tanaman;
        char tambahTanaman;

        // Perulangan untuk menambah pesanan
        do {
            System.out.print("nama : ");
            String nama = scanner.nextLine();

            System.out.print("jenis : ");
            String jenis = scanner.nextDouble();
            
            System.out.print("jumlah : ");
            int jumlah = scanner.nextDouble();

        // Tampilkan semua Tanaman
        Tanaman.tampilkanTanaman();

        // Tampilkan detail harga
        System.out.println("Nama Tanaman : ");
        System.out.println("Jumlah : ");
        System.out.println("Jenis : ");
        System.out.println("Atribut Tambahan : ");
    }
}  