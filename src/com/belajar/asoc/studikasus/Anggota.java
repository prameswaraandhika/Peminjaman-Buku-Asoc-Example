package com.belajar.asoc.studikasus;

import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String nama;
    private String alamat;
    private long nomorAnggota;
    private List<Peminjaman> peminjaman;

    public Anggota(String nama, String alamat, long nomorAnggota) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorAnggota = nomorAnggota;
        this.peminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public long getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(long nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman.add(peminjaman);
    }

    public void pinjamBuku() {
        System.out.println("Peminjaman Buku");
        System.out.println("Anggota: " + nama);
        System.out.println("===================");
        for (Peminjaman peminjaman1 : peminjaman) {
            System.out.println("Penulis: " + peminjaman1.getBuku().getPenulis());
            System.out.println("Buku: " + peminjaman1.getBuku().getJudul());
            System.out.println("Tanggal: " + peminjaman1.getTanggalPeminjaman());
            System.out.println("");
        }

    }

}
