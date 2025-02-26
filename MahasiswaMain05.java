public class MahasiswaMain05 {
    public static void main(String[] args) {
        Mahasiswa05 mhsl = new Mahasiswa05 ();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIPK(3.60);
        mhsl.tampilkanInformasi();
    }
    
}
