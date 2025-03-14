/*
    Nama File   : Tendik.java
    Deskripsi   : Subclass dari Pegawai yang merepresentasikan tenaga pendidik.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 11 Maret 2024
*/

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /***********ATRIBUT***************/
    private String bidang;
    
    /***********METHOD***************/
    //Konstruktor
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                  double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    
    //Getter dan Setter
    public String getBidang() {
        return bidang;
    }
    
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    
    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(55);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonth().plus(1), 1);
    }
    
    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja().getYears() * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + getMasaKerjaString());
        System.out.println("BUP             : " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        double tunjangan = hitungTunjangan();
        System.out.println("Tunjangan       : 1% x " + hitungMasaKerja().getYears() + 
                           " x Rp " + String.format("%,.2f", gajiPokok) + 
                           " = Rp. " + String.format("%,.2f", tunjangan));
    }
}