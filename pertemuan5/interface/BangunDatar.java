/*
    Nama File   : BangunDatar.java
    Deskripsi   : Implementasi class BangunDatar sebagai superclass Persegi dan Lingkaran
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public class BangunDatar {
    /***********ATRIBUT***************/
    private int jmlSisi;
    private String warna;
    private String border;

    /***********METHOD**************/
    //Konstruktor tanpa parameter
    public BangunDatar() {
        this.warna = "Putih";
        this.border = "Hitam";
        this.jmlSisi = 0;
    }

    //Konstruktor dengan parameter
    public BangunDatar(String warna, String border, int jmlSisi) {
        this.warna = warna;
        this.border = border;
        this.jmlSisi = jmlSisi;
    }

    //Getter dan Setter
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Jumlah Sisi: " + jmlSisi);
    }
}