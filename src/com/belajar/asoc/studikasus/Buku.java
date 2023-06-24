package com.belajar.asoc.studikasus;

public class Buku {
    private String judul;
    private String penulis;
    private String noInvetaris;

    public Buku(String judul, String penulis, String noInvetaris) {
        this.judul = judul;
        this.penulis = penulis;
        this.noInvetaris = noInvetaris;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getNoInvetaris() {
        return noInvetaris;
    }

    public void setNoInvetaris(String noInvetaris) {
        this.noInvetaris = noInvetaris;
    }

}
