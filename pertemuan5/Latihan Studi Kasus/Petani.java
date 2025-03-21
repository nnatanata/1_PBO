/*
Nama File   : Petani.java
Deskripsi   : Subclass dari Manusia yang merepresentasikan seorang petani dengan 
              atribut tambahan asal kota serta implementasi metode pajak dan masa kerja.
Pembuat     : Shofi Rasyida Nata
NIM         : 24060123120007
Tanggal     : 18 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    /***********ATRIBUT***************/
    private String asal_kota;
    private static int counterPetani = 0;

    /***********METHOD***************/
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        int C = 0; //Digit ke-12 dari NIM
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
