/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uas.mahasiswa;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String alamat;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, String fakultas, String alamat, String email, String pekerjaan, String hobi, String keahlian) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keahlian = keahlian;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Ryan Anggara", "21020081", "ManajemenInformatika", "Teknik", "Jl.juntihilir", "ryanyakuza2002@gmail.com", "Mahasiswa", "futsal", "dibidang teknik mesin dan informatika");

        // Menampilkan informasi mahasiswa
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Fakultas: " + mahasiswa.getFakultas());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        System.out.println("Email: " + mahasiswa.getEmail());
        System.out.println("Pekerjaan: " + mahasiswa.getPekerjaan());
        System.out.println("Hobi: " + mahasiswa.getHobi());
        System.out.println("Keahlian: " + mahasiswa.getKeahlian());
    }
}

 