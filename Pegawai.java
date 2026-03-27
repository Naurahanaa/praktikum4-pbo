public class Pegawai {
  
    private String id;
    private String nama;
    private String departemen;

    public Pegawai(String id, String nama, String departemen) {
        this.id = id;
        this.nama = nama;
        this.departemen = departemen;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getDepartemen() {
        return departemen;
    }
}