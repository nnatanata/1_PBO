/*
    Nama File   : Pegawai.java
    Deskripsi   : Superclass yang merepresentasikan pegawai secara umum
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /***********ATRIBUT***************/
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    
    /***********METHOD***************/
    //Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    //Getter dan Setter
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
    
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public LocalDate getTmt() {
        return tmt;
    }
    
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public Period hitungMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }
    
    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }
    
    public String getMasaKerjaString() {
        Period masaKerja = hitungMasaKerja();
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }
    
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Masa Kerja      : " + getMasaKerjaString());
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }
}