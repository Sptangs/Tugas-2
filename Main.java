public class Main {
    public static void main(String[] args) {
        
        User user = new User();
        user.mengisiData(10, "Budi", "budi@mail.com", "rahasia123", "Jakarta");
        
        CV cv = new CV();
        cv.mengisiData(1, user.id_user, "cv_budi.pdf", "github.com/budi");
       
        Perusahaan perusahaan = new anakPerusahaan();
        ((anakPerusahaan) perusahaan).mengisiDataAnak(
                3,
                "PT Maju Jaya Cabang",
                "Bandung",
                "hr@majujaya.com",
                "PT Maju Jaya Pusat",
                "Software Development"
        );
        Lowongan lowongan = new Lowongan();
        lowongan.mengisiData(
                1,
                perusahaan, 
                "Java Developer",
                "Mengembangkan aplikasi backend",
                "Bandung"
        );

        Lamaran lamaran = new Lamaran();
        lamaran.mengisiData(
                221,
                user,
                lowongan,
                "2026-03-02",
                "Diproses"
        );

        Seleksi seleksi = new Seleksi();
        seleksi.mengisiData(
                1,
                lamaran,
                "Interview",
                "Lolos"
        );

        Admin admin = new Admin();
        admin.mengisiData(
                1,
                "Septian",
                "admin@mail.com",
                "admin123"
        );

        Notifikasi notifikasi = new Notifikasi();
        notifikasi.mengisiData(
                1,
                user,
                "Selamat! Anda lolos tahap Interview.",
                "2026-03-05",
                "Belum Dibaca"
        );

        user.tampilInfo(); System.out.println();
        cv.tampilInfo(); System.out.println();
        lowongan.tampilInfo(); System.out.println();
        lamaran.tampilInfo(); System.out.println();
        seleksi.tampilInfo(); System.out.println();
        perusahaan.tampilInfo(); System.out.println();
        admin.tampilInfo(); System.out.println();
        notifikasi.tampilInfo();
    }
}