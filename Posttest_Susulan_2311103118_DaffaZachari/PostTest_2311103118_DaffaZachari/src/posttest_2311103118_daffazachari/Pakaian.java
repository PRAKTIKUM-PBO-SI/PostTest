package posttest_2311103118_daffazachari;

/**
 * @author imansan
 */
public class Pakaian {
    private String nama;
    private String jenis;
    private String atributTambahan;
    private String pakaianbaru;
    private int jumlah;
    private final double harga;
    
    
    public Pakaian(String nama, int jumlah, double harga, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.jumlah = jumlah;
        
    }
    
    public void tampilkanData() {
        System.out.println("Nama Pakaian: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Atribut Tambahan: " + atributTambahan);
        System.out.println("Pakaian Baru: " + pakaianbaru);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: Rp" + harga);
    }
    
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getAtributTambahan() {
        return atributTambahan;
    }
    
    public void setAtributTambahan(String atributTambahan) {
        this.atributTambahan = atributTambahan;
    }
    
    public String getPakaianBaru() {
        return pakaianbaru;
    }
    
    public void setPakaianBaru(String pakaianbaru) {
        this.pakaianbaru = pakaianbaru;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public double getHarga() {
        return harga;
    }
}