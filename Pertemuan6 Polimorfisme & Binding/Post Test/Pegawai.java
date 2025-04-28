/*
    Nama File   : Pegawai.java
    Deskripsi   : Kelas induk yang merepresentasikan pegawai dengan atribut nama dan gaji pokok.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 22 April 2025
*/

public class Pegawai {
    /***********ATRIBUT***************/
    protected String nama;
    protected int gajiPokok = 5000000;

    /***********METHOD***************/
    //Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Method tampilData
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
