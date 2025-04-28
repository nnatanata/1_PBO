/*
    Nama File   : Programmer.java
    Deskripsi   : Kelas turunan dari Pegawai yang merepresentasikan Programmer dengan atribut bonus.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Programmer extends Pegawai {
    /***********ATRIBUT***************/
    private int bonus = 450000;

    /***********METHOD***************/
    //Konstruktor dengan parameter
    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
    }
}
