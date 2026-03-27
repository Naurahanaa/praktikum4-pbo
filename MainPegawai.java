import java.util.ArrayList;

public class MainPegawai {
    public static void main(String[] args) {

        ArrayList<Pegawai> sdm = new ArrayList<>();
        ArrayList<Pegawai> keuangan = new ArrayList<>();
        ArrayList<Pegawai> produksi = new ArrayList<>();

        // Data sesuai soal
        Pegawai p1 = new Pegawai("012110", "Uchiha Itachi", "SDM");
        Pegawai p2 = new Pegawai("33-001", "Sasori", "Keuangan");
        Pegawai p3 = new Pegawai("IW-08721", "Deidara", "Produksi");

        // Masukkan ke ArrayList sesuai departemen
        sdm.add(p1);
        keuangan.add(p2);
        produksi.add(p3);

        // Tampilkan per departemen
        System.out.println("=== SDM ===");
        for (Pegawai p : sdm) {
            tampil(p);
        }

        System.out.println("\n=== Keuangan ===");
        for (Pegawai p : keuangan) {
            tampil(p);
        }

        System.out.println("\n=== Produksi ===");
        for (Pegawai p : produksi) {
            tampil(p);
        }
    }

    public static void tampil(Pegawai p) {
        System.out.println("ID: " + p.getId());
        System.out.println("Nama: " + p.getNama());
        System.out.println("Departemen: " + p.getDepartemen());
        System.out.println();
    }
}