/*
Nama File   : MManusia.java
Deskripsi   : Program utama untuk menguji kelas-kelas Manusia, PNS, Pengusaha, dan Petani 
              dengan menampilkan jumlah objek, pajak, dan masa kerja masing-masing.
Pembuat     : Shofi Rasyida Nata
NIM         : 24060123120007
Tanggal     : 18 Maret 2024
*/

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());

        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
