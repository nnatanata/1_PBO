/*
    Nama File   : DosenTamu.java
    Deskripsi   : Subclass dari Dosen yang merepresentasikan dosen tidak tetap.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /***********ATRIBUT***************/
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;
    
    /***********METHOD***************/
    //Konstruktor
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                     double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    //Getter dan Setter
    public String getNidk() {
        return nidk;
    }
    
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }
    
    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }
    
    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    public Period hitungMasaKontrakTersisa() {
        return Period.between(LocalDate.now(), tanggalBerakhirKontrak);
    }
    
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + getMasaKerjaString());
        Period masaKontrak = hitungMasaKontrakTersisa();
        System.out.println("Masa Kontrak    : " + masaKontrak.getYears() + " tahun " + 
                           masaKontrak.getMonths() + " bulan");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : 2,5% x Rp " + String.format("%,.2f", gajiPokok) + 
                           " = Rp. " + String.format("%,.2f", tunjangan));
    }
}