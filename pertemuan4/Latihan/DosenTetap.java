/*
    Nama File   : DosenTetap.java
    Deskripsi   : Subclass dari Dosen yang merepresentasikan dosen tetap.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    /***********ATRIBUT***************/
    private String nidn;
    
    /***********METHOD***************/
    //Konstruktor
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                      double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    
    //Getter dan Setter
    public String getNidn() {
        return nidn;
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(65);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonth().plus(1), 1);
    }
    
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja().getYears() * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + getMasaKerjaString());
        System.out.println("BUP             : " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : 2% x " + hitungMasaKerja().getYears() + 
                           " x Rp " + String.format("%,.2f", gajiPokok) + 
                           " = Rp. " + String.format("%,.2f", tunjangan));
    }
}