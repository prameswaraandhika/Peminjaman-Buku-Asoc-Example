package com.belajar.asoc.studikasus;

import java.time.LocalDate;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Anggota anggota = new Anggota("Andhika", "Jakarta", 1);
        Buku buku1 = new Buku("Java OOP", "James Gosling", "A121");
        Buku buku2 = new Buku("Java Spring", "James Gosling", "A121");
        Buku buku3 = new Buku("Java JDBC", "James Gosling", "A121");
        Peminjaman peminjaman1 = new Peminjaman(buku1, anggota, LocalDate.of(2000, 5, 23));
        Peminjaman peminjaman2 = new Peminjaman(buku2, anggota, LocalDate.of(2000, 5, 23));
        Peminjaman peminjaman3 = new Peminjaman(buku3, anggota, LocalDate.of(2000, 5, 23));
        anggota.setPeminjaman(peminjaman1);
        anggota.setPeminjaman(peminjaman2);
        anggota.setPeminjaman(peminjaman3);
        anggota.pinjamBuku();
    }
}