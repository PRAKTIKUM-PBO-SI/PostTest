package postes_2311103134_muhammadrafiawallaisal;
import java.util.Scanner;
/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class PosTes_2311103134_MuhammadRafiAwallaisal {

    public static void main(String[] args) {
        ManajemenTaman manajemenTaman = new ManajemenTaman();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Tanaman Bunga");
            System.out.println("2. Tambah Tanaman Pohon");
            System.out.println("3. Tampilkan Semua Tanaman");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            
          
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();  
            } else {
                System.out.println("Input tidak valid, masukkan angka.");
                scanner.next();  
                continue;        
            }
            switch (pilihan) {
                case 1, 2 -> manajemenTaman.tambahTanaman();
                case 3 -> manajemenTaman.tampilkanSemuaTanaman();
                case 4 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
}
}
}