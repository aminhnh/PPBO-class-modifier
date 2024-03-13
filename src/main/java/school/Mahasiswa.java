package school;

public class Mahasiswa extends Manusia {
    // Atribut
    private String password;
    String nim;
    int angkatan;
    int semester;
    double ipk;
    public int jumlahBolos;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Constructor
    public Mahasiswa(String namaMahasiswa, String nim, int umur) {
        super.nama = namaMahasiswa;
        super.umur = umur;
        this.nim = nim;
        this.jumlahBolos = 0;
    }
    // Method
    void bolehUjian() {
        if (jumlahBolos > 7) {
            System.out.println("Mahasiswa tidak boleh ujian");
        } else {
            System.out.println("Mahasiswa boleh ujian");
        }
    }

    @Override
    public String toString() {
        return "Nama = " + nama +
                "\nNIM = " + nim +
                "\nAngkatan = " + angkatan +
                "\nSemester = " + semester +
                "\nIPK = " + ipk +
                "\nJumlah Bolos = " + jumlahBolos;
    }
}
