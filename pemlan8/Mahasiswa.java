public class Mahasiswa {
    //atribut
    private String nim;
    private String nama;


    //konstruktor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    //method getter untuk mendapatkan nim dan nama
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}