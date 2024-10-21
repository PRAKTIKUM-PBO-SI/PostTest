package posttest_zoesatrian_2311103141;

/**
 * Zoe Satrian / 2311103141
 * S1SI-07-C
 */
public class Main {
    private static ManajemenTaman manajemenTaman = new ManajemenTaman();

    public static void main(String[] args) {
        tambahTanamanBunga();
        tambahTanamanPohen();
        tampilkanSemuaTanaman();
        keluarAplikasi();
    }

    private static void tambahTanamanBunga() {
        Tanaman tanamanBunga = new Tanaman("Tanaman Bunga", 10, "Bunga", null);
        manajemenTaman.tambahTanaman(tanamanBunga);
    }

    private static void tambahTanamanPohen() {
        Tanaman tanamanPohen = new Tanaman("Tanaman Pohen", 5, "Pohen", null);
        manajemenTaman.tambahTanaman(tanamanPohen);
    }

    private static void tampilkanSemuaTanaman() {
        List<Tanaman> daftarTanaman = manajemenTaman.getDaftarTanaman();
        for (Tanaman tanaman : daftarTanaman) {
            tanaman.tampilkanData();
        }
    }

    private static void keluarAplikasi() {
        System.out.println("Keluar Aplikasi");
        System.exit(0);
    }
}