package posttest;

/**
 *
 * @author Fachrullah Zhafran Listiyono_2211103115
 */
public class Tanaman {

    String nama;
    int jumlah;
    String jenis;
    String atributTambahan; 

    public Tanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }

    public void tampilkanData() {
        System.out.println("Nama Tanaman: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Jenis: " + jenis);
        if (jenis.equals("Bunga")) {
            System.out.println("Warna Bunga: " + atributTambahan);
        } else if (jenis.equals("Pohon")) {
            System.out.println("Tinggi Pohon: " + atributTambahan);
        }
        System.out.println();
    }
}
