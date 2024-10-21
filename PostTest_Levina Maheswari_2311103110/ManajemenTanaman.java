/**
 * @author Levina Maheswari 
 * 2311103110/S1SI07C
 */
public class ManajemenTanaman {
    Tanaman[] daftarTanaman;
    int jumlahTanaman;
    int totalItem;
public ManajemenTanaman(int kapasitas){
    daftarTanaman = new Tanaman [kapasitas];
    jumlahTanaman = 0;
    totalItem = 0;
}
public void tambahTanaman(Tanaman item){
    daftarTanaman[jumlahTanaman] = item;
    totalItem += item.jumlah;
    jumlahTanaman++;
}
public void tampilSemuaTanaman(){
    System.out.println("Daftar Tanaman : ");
     for (int i = 0; i < jumlahTanaman; i++) {
            daftarTanaman[i].tampilkanInfo();
        }
     System.out.println("Data Tanaman adalah " + totalItem);
}
}