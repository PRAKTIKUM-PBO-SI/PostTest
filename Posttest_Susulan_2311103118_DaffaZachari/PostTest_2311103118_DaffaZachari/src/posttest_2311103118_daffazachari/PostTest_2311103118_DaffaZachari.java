package posttest_2311103118_daffazachari;

import java.util.Scanner;
import java.util.InputMismatchException;


public class PostTest_2311103118_DaffaZachari {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenStock manajemen = new ManajemenStock();
        
        while (true) {
            try {
                tampilkanMenu();
                System.out.print("Pilih menu (1-5): ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (pilihan) {
                    case 1 -> tambahPakaianPria(scanner, manajemen);
                    case 2 -> tambahPakaianWanita(scanner, manajemen);
                    case 3 -> manajemen.tampilkanSemuaPakaian();
                    case 4 -> cariBerdasarkanNama(scanner, manajemen);
                    case 5 -> {
                        System.out.println("Terima kasih telah menggunakan program ini!");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukan tidak valid! Harap masukkan angka.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); 
            }
            
            System.out.println("\nTekan Enter untuk melanjutkan...");
            scanner.nextLine();
            clearScreen();
        }
    }
    
    private static void tampilkanMenu() {
    
        System.out.println("=================================");
        System.out.println("| 1. Tambah Pakaian Pria       |");
        System.out.println("| 2. Tambah Pakaian Wanita     |");
        System.out.println("| 3. Tampilkan Semua Pakaian   |");
        System.out.println("| 4. Cari Pakaian              |");
        System.out.println("| 5. Keluar                    |");
        System.out.println("=================================");
    }
    

    private static void tambahPakaianPria(Scanner scanner, ManajemenStock manajemen) {
        System.out.println("\n=== TAMBAH PAKAIAN PRIA ===");
        
        System.out.print("Masukkan Nama Pakaian: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jumlah: ");
        int jumlah = validateIntegerInput(scanner, "Jumlah");
        
        System.out.print("Masukkan Harga: Rp");
        double harga = validateDoubleInput(scanner, "Harga");
        
        System.out.print("Masukkan Warna: ");
        String warna = scanner.nextLine();
        
        if (manajemen.tambahPakaian(nama, jumlah, harga, "Pria")) {
            System.out.println("Pakaian pria berhasil ditambahkan!");
        }
    }
    
    private static void tambahPakaianWanita(Scanner scanner, ManajemenStock manajemen) {
        System.out.println("\n=== TAMBAH PAKAIAN WANITA ===");
        
        System.out.print("Masukkan Nama Pakaian: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Jumlah: ");
        int jumlah = validateIntegerInput(scanner, "Jumlah");
        
        System.out.print("Masukkan Harga: Rp");
        double harga = validateDoubleInput(scanner, "Harga");
        
        System.out.print("Masukkan Warna: ");
        String warna = scanner.nextLine();
        
        if (manajemen.tambahPakaian(nama, jumlah, harga, "Wanita")) {
            System.out.println("Pakaian wanita berhasil ditambahkan!");
        }
    }
    
    
    private static void cariBerdasarkanNama(Scanner scanner, ManajemenStock manajemen) {
        System.out.println("\n=== CARI PAKAIAN ===");
        System.out.print("Masukkan nama pakaian yang dicari: ");
        String nama = scanner.nextLine();
        manajemen.cariPakaian(nama);
    }
    
    
    private static int validateIntegerInput(Scanner scanner, String fieldName) {
        while (true) {
            try {
                int value = scanner.nextInt();
                scanner.nextLine(); 
                if (value <= 0) {
                    throw new IllegalArgumentException(fieldName + " harus lebih dari 0!");
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.print("Error: Masukkan angka yang valid untuk " + fieldName + ": ");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.print("Error: " + e.getMessage() + " Masukkan kembali " + fieldName + ": ");
            }
        }
    }
    
   
    private static double validateDoubleInput(Scanner scanner, String fieldName) {
        while (true) {
            try {
                double value = scanner.nextDouble();
                scanner.nextLine(); 
                if (value <= 0) {
                    throw new IllegalArgumentException(fieldName + " harus lebih dari 0!");
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.print("Error: Masukkan angka yang valid untuk " + fieldName + ": ");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.print("Error: " + e.getMessage() + " Masukkan kembali " + fieldName + ": ");
            }
        }
    }
    
  
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
}