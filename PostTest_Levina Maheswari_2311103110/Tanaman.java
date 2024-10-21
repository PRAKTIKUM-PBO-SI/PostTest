

public class Tanaman {
    String nama, jenis, atributTambahan;
    int jumlah; // 1: Pembuka, 2: Utama, 3: Minuman
    public Tanaman(String namaItem, String jenis, int jumlah, String atributTambahan) {
    this.nama = namaItem;
    this.jenis = jenis;
    this.atributTambahan = atributTambahan;
    this.jumlah = jumlah;
}
    // Method untuk menampilkan informasi menu
    public void tampilkanInfo() {
        System.out.println(nama);
        System.out.println(jenis);
        System.out.println(atributTambahan);
        System.out.println(jumlah);
        }
    }
