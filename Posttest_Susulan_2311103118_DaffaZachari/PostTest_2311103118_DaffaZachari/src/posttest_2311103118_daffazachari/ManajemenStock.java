package posttest_2311103118_daffazachari;


 /* 
 * @author imansan
 */
public class ManajemenStock {
    private final Pakaian[] daftarPakaian;
    private int jumlahPakaian;
    private static final int KAPASITAS_MAKSIMAL = 100;
    
 
    public ManajemenStock() {
        daftarPakaian = new Pakaian[KAPASITAS_MAKSIMAL];
        jumlahPakaian = 0;
    }
    
    public boolean tambahPakaian(String nama, int jumlah, double harga, String jenis) {
        if (jumlahPakaian >= KAPASITAS_MAKSIMAL) {
            System.out.println("Maaf, kapasitas penyimpanan sudah penuh!");
            return false;
        }
        
        if (jumlah <= 0) {
            System.out.println("Jumlah pakaian harus lebih dari 0!");
            return false;
        }
        
        if (harga <= 0) {
            System.out.println("Harga pakaian harus lebih dari 0!");
            return false;
        }
        
        Pakaian pakaianBaru = new Pakaian(nama, jumlah, harga, jenis);
        daftarPakaian[jumlahPakaian] = pakaianBaru;
        jumlahPakaian++;
        System.out.println("Pakaian berhasil ditambahkan!");
        return true;
    }
    
   
    public void tampilkanSemuaPakaian() {
        if (jumlahPakaian == 0) {
            System.out.println("Belum ada pakaian yang ditambahkan.");
            return;
        }
        
        System.out.println("\n=== DAFTAR PAKAIAN ===");
        for (int i = 0; i < jumlahPakaian; i++) {
            System.out.println("\nPakaian #" + (i + 1));
            System.out.println("----------------");
            daftarPakaian[i].tampilkanData();
        }
    }
    
    
    public void cariPakaian(String nama) {
        boolean ditemukan = false;
        
        for (int i = 0; i < jumlahPakaian; i++) {
            if (daftarPakaian[i].getNama().toLowerCase().contains(nama.toLowerCase())) {
                if (!ditemukan) {
                    System.out.println("\n=== HASIL PENCARIAN ===");
                    ditemukan = true;
                }
                System.out.println("\nPakaian #" + (i + 1));
                System.out.println("----------------");
                daftarPakaian[i].tampilkanData();
            }
        }
        
        if (!ditemukan) {
            System.out.println("Pakaian dengan nama '" + nama + "' tidak ditemukan.");
        }
    }
    
    
    public boolean updateJumlahPakaian(int index, int jumlahBaru) {
        if (index < 0 || index >= jumlahPakaian) {
            System.out.println("Index pakaian tidak valid!");
            return false;
        }
        
        if (jumlahBaru <= 0) {
            System.out.println("Jumlah pakaian harus lebih dari 0!");
            return false;
        }
        
        daftarPakaian[index].setJumlah(jumlahBaru);
        System.out.println("Jumlah pakaian berhasil diupdate!");
        return true;
    }
    
    
    public boolean hapusPakaian(int index) {
        if (index < 0 || index >= jumlahPakaian) {
            System.out.println("Index pakaian tidak valid!");
            return false;
        }
        

        for (int i = index; i < jumlahPakaian - 1; i++) {
            daftarPakaian[i] = daftarPakaian[i + 1];
        }
        
        daftarPakaian[jumlahPakaian - 1] = null;
        jumlahPakaian--;
        
        System.out.println("Pakaian berhasil dihapus!");
        return true;
    }
    
    public int getJumlahPakaian() {
        return jumlahPakaian;
    }
}