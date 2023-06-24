package com.belajar.asoc.studikasus;

import java.time.LocalDate;

public class Peminjaman {
    private Buku buku;
    private Anggota anggota;
    private LocalDate tanggalPeminjaman;

    public Peminjaman(Buku buku, Anggota anggota) {
        this.buku = buku;
        this.anggota = anggota;
    }

    public Peminjaman(Buku buku, Anggota anggota, LocalDate tanggalPeminjaman) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public LocalDate getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }
}
