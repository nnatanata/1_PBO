/*
Nama File   : Manusia.java
Deskripsi   : Class abstrak yang merepresentasikan manusia dengan atribut dasar dan metode untuk menghitung
              masa kerja serta mencetak informasi.
Pembuat     : Shofi Rasyida Nata
NIM         : 24060123120007
Tanggal     : 18 Maret 2024
*/

import java.time.LocalDate;

public abstract class Manusia {
    /***********ATRIBUT***************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /***********METHOD***************/
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
