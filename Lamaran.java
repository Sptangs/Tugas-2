public class Lamaran {
    public int id_lamaran;
    public User user;         
    public Lowongan lowongan;  
    public String tanggal;
    public String status;

    public void mengisiData(int id_lamaran, User user, Lowongan lowongan, String tanggal, String status) {
        this.id_lamaran = id_lamaran;
        this.user = user;
        this.lowongan = lowongan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public void tampilInfo() {
        System.out.println("===== DATA LAMARAN =====");
        System.out.println("ID Lamaran : " + id_lamaran);
        System.out.println("ID User    : " + user.id_user);
        System.out.println("ID Lowongan: " + lowongan.id_lowongan);
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("Status     : " + status);
    }
}