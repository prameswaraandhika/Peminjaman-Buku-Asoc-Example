package com.belajar.asoc.onetoone;

class PemilikRumah {
    private String nama;
    private Rumah rumah;

    public PemilikRumah(String nama, Rumah rumah) {
        this.nama = nama;
        this.rumah = rumah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Rumah getRumah() {
        return rumah;
    }

    public void setRumah(Rumah rumah) {
        this.rumah = rumah;
    }

}

class Rumah {
    private String alamat;
    private PemilikRumah pemilikRumah;

    public Rumah(String alamat, PemilikRumah pemilikRumah) {
        this.alamat = alamat;
        this.pemilikRumah = pemilikRumah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public PemilikRumah getPemilikRumah() {
        return pemilikRumah;
    }

    public void setPemilikRumah(PemilikRumah pemilikRumah) {
        this.pemilikRumah = pemilikRumah;
    }

}

public class RumahExample {
    public static void main(String[] args) {
        PemilikRumah pemilik = new PemilikRumah("Andhika", null);
        Rumah rumah = new Rumah("Jalan ABC No. 123", pemilik);
        pemilik.setRumah(rumah);

        rumah.setPemilikRumah(pemilik);

        System.out.println("Pemilik rumah: " + rumah.getPemilikRumah().getNama());
        System.out.println("Alamat rumah: " + pemilik.getRumah().getAlamat());
    }
}
