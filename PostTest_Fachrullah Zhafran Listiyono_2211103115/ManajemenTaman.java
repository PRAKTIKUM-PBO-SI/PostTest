package posttest;
/**
 *
 * @author Fachrullah Zhafran Listiyono_2211103115
 */
import java.util.ArrayList;

public class ManajemenTaman {

    ArrayList<Tanaman> daftarTanaman = new ArrayList<>(); 
    public void tambahTanaman(String nama, int jumlah, String jenis, String atributTambahan) {
        Tanaman tanamanBaru = new Tanaman(nama, jumlah, jenis, atributTambahan);
        daftarTanaman.add(tanamanBaru);
        System.out.println("Tanaman berhasil ditambahkan!\n");
    }

    public void tampilkanSemuaTanaman() {
        if (daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman yang tercatat.\n");
        } else {
            System.out.println("Daftar Semua Tanaman:");
            for (Tanaman tanaman : daftarTanaman) {
                tanaman.tampilkanData();
            }
        }
    }
}
