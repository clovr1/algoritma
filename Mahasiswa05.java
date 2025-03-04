public class Mahasiswa05 {
    String nama;
    String nim;
    String kelas;
    double ipk; 

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk); 
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        Mahasiswa05 mahasiswa = new Mahasiswa05();
        mahasiswa.nama = "John Doe";
        mahasiswa.nim = "1234567890";
        mahasiswa.kelas = "A";

        
        mahasiswa.updateIPK(3.7);
        mahasiswa.tampilkanInformasi();
        String nilaiKinerja = mahasiswa.nilaiKinerja();
        System.out.println("Nilai Kinerja: " + nilaiKinerja);


        
        mahasiswa.updateIPK(5.0); 
        mahasiswa.tampilkanInformasi();

    }
}