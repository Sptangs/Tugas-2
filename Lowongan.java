class Lowongan {
    public int id_lowongan;
    public Perusahaan perusahaan;
    public String judul;
    public String deskripsi;
    public String lokasi;

    public void mengisiData(int id_lowongan, Perusahaan perusahaan, String judul, String deskripsi, String lokasi) {
        this.id_lowongan = id_lowongan;
        this.perusahaan = perusahaan;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
    }

    public void tampilInfo() {
        System.out.println("===== DATA LOWONGAN =====");
        System.out.println("ID Lowongan   : " + id_lowongan);
        System.out.println("ID Perusahaan : " + perusahaan.id_perusahaan);
        System.out.println("Judul         : " + judul);
        System.out.println("Deskripsi     : " + deskripsi);
        System.out.println("Lokasi        : " + lokasi);
    }
}