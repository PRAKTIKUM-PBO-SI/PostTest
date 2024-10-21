import java.util.Scanner;
/**
 * @author Levina Maheswari
 * 2311103110/S1SI07C
 */
public class Main {
   public static void main (String[] args){
   int pilihan;
       Scanner scanner = new Scanner(System.in);
       ManajemenTanaman ManajemenTanaman = new ManajemenTanaman(10);
          
           do{
               System.out.println("===== Menu Manajamen Tanaman ======");
               System.out.println("1. Tambah Bunga");
               System.out.println("2. Tambah Tanaman");
               System.out.println("3. Tampilkan semua data");
               System.out.println("4. Keluar");
               System.out.println("Pilihan : ");
               pilihan =scanner.nextInt();
               scanner.nextLine();
               
               switch (pilihan){
                   case 1 :
                       System.out.println("Masukan nama bunga : ");
                       String namaBunga = scanner.nextLine();
                       break;
                   case 2 :
                       System.out.println("Masukan nama tanaman : ");
                       String namaTanaman = scanner.nextLine();
                       break;
                   case 3 :
                       System.out.println("Tampilkan semua data : ");
                       break;
                   case 4 :
                       System.out.println("Keluar dari program");
                       break;
                   default :
                   System.out.println("Pilihan tidak ada");
               }
           }while (pilihan != 4);
            scanner.close();
           } 
}
           
          
       
       
       
   
