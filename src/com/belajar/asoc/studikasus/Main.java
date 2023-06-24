package com.belajar.asoc.studikasus;

import java.time.LocalDate;

/**
 * Asosiasi Objek = Hubungan antara objek
 * Agregasi
 * - Hubungan antara dua objek dimana satu objek berperan sebagai container
 *   objek lain
 * - Objek yang ditampung bisa ada secara independent tidak bergantung ke objek
 *   yang menampung dan dapat terhubung dengan objek lain atau dengan objek
 *   pemilik yang berbeda.
 * - Contoh: Hubungan antara Anggota dan Peminjaman dalam contoh kasus peminjaman
 *   buku. Seorang Anggota dapat memiliki banyak Peminjaman, tetapi Peminjaman
 *   juga dapat ada secara independen tanpa tergantung pada Anggota.
 * 
 * 
 * 
 */
public class Main {

    public static void main(String[] args) {
        Anggota anggota = new Anggota("Andhika", "Jakarta", 1);
        Buku buku1 = new Buku("Java OOP", "James Gosling", "A121");
        Buku buku2 = new Buku("Java Spring", "James Gosling", "A122");
        Buku buku3 = new Buku("Java JDBC", "James Gosling", "A123");
        Peminjaman peminjaman1 = new Peminjaman(buku1, LocalDate.of(2000, 5, 23));
        Peminjaman peminjaman2 = new Peminjaman(buku2, LocalDate.of(2000, 5, 23));
        Peminjaman peminjaman3 = new Peminjaman(buku3, LocalDate.of(2000, 5, 23));
        anggota.setPeminjaman(peminjaman1);
        anggota.setPeminjaman(peminjaman2);
        anggota.setPeminjaman(peminjaman3);
        anggota.pinjamBuku();
    }
}