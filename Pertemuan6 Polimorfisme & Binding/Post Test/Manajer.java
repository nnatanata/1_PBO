/*
    Nama File   : Manajer.java
    Deskripsi   : Kelas turunan dari Pegawai yang merepresentasikan Manajer dengan atribut tunjangan.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Manajer extends Pegawai {
    /***********ATRIBUT***************/
    private int tunjangan = 700000;

    /***********METHOD***************/
    //Konstruktor dengan parameter
    public Manajer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}
