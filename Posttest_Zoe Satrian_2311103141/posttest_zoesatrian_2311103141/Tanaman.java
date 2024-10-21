package posttest_zoesatrian_2311103141;

/**
 * Zoe Satrian / 2311103141
 * S1SI-07-C
 */
public class Tanaman {
    String nama;
    int jumlah;
    String jenis;
    String atributTambahan;
    
    public Tanaman(String nama, int jumlah, String jenis, String atributTambahan){
        this.nama = nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }
    
    public void tampilkanData() {
        System.out.println("Nama:" + this.nama);
        System.out.println("Jumlah:" + this.jumlah);
        System.out.println("Jenis:" + this.jenis);
        System.out.println("atributTambahan:" + this.atributTambahan);
    }
}