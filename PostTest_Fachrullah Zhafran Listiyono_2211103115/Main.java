package posttest;
/**
 *
 * @author Fachrullah Zhafran Listiyono_2211103115
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenTaman manajemenTaman = new ManajemenTaman();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Tanaman Bunga");
            System.out.println("2. Tambah Tanaman Pohon");
            System.out.println("3. Tampilkan Semua Tanaman");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Tambah Tanaman Bunga
                    System.out.print("Masukkan nama tanaman: ");
                    String namaBunga = input.nextLine();
                    System.out.print("Masukkan jumlah tanaman: ");
                    int jumlahBunga = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan warna bunga: ");
                    String warnaBunga = input.nextLine();
                    manajemenTaman.tambahTanaman(namaBunga, jumlahBunga, "Bunga", warnaBunga);
                    break;

                case 2:
                    // Tambah Tanaman Pohon
                    System.out.print("Masukkan nama tanaman: ");
                    String namaPohon = input.nextLine();
                    System.out.print("Masukkan jumlah tanaman: ");
                    int jumlahPohon = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    System.out.print("Masukkan tinggi pohon: ");
                    String tinggiPohon = input.nextLine();
                    manajemenTaman.tambahTanaman(namaPohon, jumlahPohon, "Pohon", tinggiPohon);
                    break;

                case 3:
                    // Tampilkan Semua Tanaman
                    manajemenTaman.tampilkanSemuaTanaman();
                    break;

                case 4:
                    // Keluar
                    isRunning = false;
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        }

        input.close();
    }
}
