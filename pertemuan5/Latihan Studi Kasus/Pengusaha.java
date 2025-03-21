/*
Nama File   : Pengusaha.java
Deskripsi   : Subclass dari Manusia yang merepresentasikan seorang pengusaha dengan
              atribut tambahan NPWP serta implementasi metode pajak dan masa kerja.
Pembuat     : Shofi Rasyida Nata
NIM         : 24060123120007
Tanggal     : 18 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    /***********ATRIBUT***************/
    private String npwp;
    private static int counterPengusaha = 0;

    /***********METHOD***************/
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        int B = 0; //Digit ke-13 dari NIM
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}
