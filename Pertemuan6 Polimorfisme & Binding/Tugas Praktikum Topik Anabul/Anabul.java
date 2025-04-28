/*
    Nama File   : Anabul.java
    Deskripsi   : Kelas induk untuk merepresentasikan anabul (hewan peliharaan) secara umum.
                  Memiliki atribut nama, serta metode gerak() dan bersuara().
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Anabul {
    /***********ATRIBUT***************/
    private String nama;

    /***********METHOD***************/
    //Konstruktor tanpa parameter
    public Anabul() {
        this.nama = "";
    }

    //Konstruktor dengan parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Method untuk gerak
    public void gerak() {
        System.out.println(nama + " bergerak.");
    }

    //Method untuk bersuara
    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }

    //Method tampilData
    public void tampilData() {
        gerak();
        bersuara();
    }
}
