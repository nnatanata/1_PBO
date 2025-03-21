/*
Nama File   : PNS.java
Deskripsi   : Subclass dari Manusia yang merepresentasikan seorang PNS dengan atribut 
              tambahan NIP serta implementasi metode pajak dan masa kerja.
Pembuat     : Shofi Rasyida Nata
NIM         : 24060123120007
Tanggal     : 18 Maret 2024
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    /***********ATRIBUT***************/
    private String nip;
    private static int counterPNS = 0;

    /***********METHOD***************/
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        int A = 7; //Digit ke-14 dari NIM
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}
