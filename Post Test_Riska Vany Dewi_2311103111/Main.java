/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_2311103111_riskavanydewi;

/**
 * @author Riska Vany Dewi
 */

import java.util.Scanner;

public class Main {
    
    
    //public void Menu(){
    public static void main(String[] args){
       Scanner scanner = new Scanner (System.in);
       ManajemenTaman taman = new ManajemenTaman(10);
       
      int menu;
      do {
        System.out.println("===== Menu Manajemen Tanaman =====");
        System.out.println("1. Tambah Bunga");
        System.out.println("2. Tambah Pohon");
        System.out.println("3. Tampilkan Semua Tanaman");
        System.out.println("4. Keluar");
        System.out.println("Pilih: ");
        menu = scanner.nextInt();
        scanner.nextLine();
       
        switch (menu){
            case 1:
                System.out.println("Nama Bunga: ");
                String namaBunga = scanner.nextLine();
                
            case 2:
                System.out.println("Nama Pohon: ");
                String namaPohon = scanner.nextLine();
                
            case 3:
                taman.tampilkanSemuaTanaman();
                break;
                
            case 4:
                System.out.println("Keluar dari sistem");
                break;
                
            default:
                System.out.println("Pilihan tidak valid");
            
        }
        
      } while (menu <= 4);
}
   
}