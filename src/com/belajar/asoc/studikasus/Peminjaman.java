package com.belajar.asoc.studikasus;

import java.time.LocalDate;

public class Peminjaman {
    private Buku buku;
    private LocalDate tanggalPeminjaman;

    public Peminjaman(Buku buku, LocalDate localDate) {
        this.buku = buku;
        this.tanggalPeminjaman = localDate;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public LocalDate getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }
}
