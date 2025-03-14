/*
    Nama File   : Dosen.java
    Deskripsi   : Subclass dari Pegawai yang merepresentasikan pegawai dengan status sebagai dosen. 
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /***********ATRIBUT***************/
    protected String fakultas;
    
    /***********METHOD***************/
    //Konstruktor
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
    
    //Getter dan Setter
    public String getFakultas() {
        return fakultas;
    }
    
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + fakultas);
    }
}