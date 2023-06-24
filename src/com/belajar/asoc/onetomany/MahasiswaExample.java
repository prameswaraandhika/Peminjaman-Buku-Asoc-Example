package com.belajar.asoc.onetomany;

import java.util.ArrayList;
import java.util.List;

/*
 * Asoc adalah hubungan atau relasi dari satu kelas ke kelas lain
 * Dibawah ini adalah contoh studi cases asoc object one to many
 * Dimana universitas dapat memilik banyak objek yaitu Mahasiswa
 */
class Mahasiswa {
    private String name;

    public Mahasiswa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Universitas {
    private String nama;
    private List<Mahasiswa> list;

    public Universitas(String nama) {
        this.nama = nama;
        this.list = new ArrayList<>();
    }

    public void tambahMhs(Mahasiswa mhs) {
        list.add(mhs);
    }

    public void tampilkanMhs() {
        System.out.println("Daftar mahasiswa di " + nama + ":");
        for (Mahasiswa mahasiswa : list) {
            System.out.println("- " + mahasiswa.getName());
        }
    }

}

public class MahasiswaExample {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Andhika");
        Mahasiswa mhs2 = new Mahasiswa("Prameswara");
        Mahasiswa mhs3 = new Mahasiswa("Budianto");

        Universitas universitas = new Universitas("Bina Insani");
        universitas.tambahMhs(mhs1);
        universitas.tambahMhs(mhs2);
        universitas.tambahMhs(mhs3);

        universitas.tampilkanMhs();
    }
}
