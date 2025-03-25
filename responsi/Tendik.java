/*
    Nama File   : Tendik.java
    Deskripsi   : Subclass dari Karyawan yang merepresentasikan tenaga kependidikan.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Maret 2024
*/

public class Tendik extends Karyawan {
    public static int count = 0;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        count++;
    }

    @Override
    public double hitungGaji() {
        double pokok = 4000000;
        return pokok + (masaKerja * 0.01 * pokok);
    }

    @Override
    public void printInfo() {
        System.out.println("=== Tendik ===");
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("NIP       : " + NIP);
        System.out.println("Masa kerja: " + masaKerja + " tahun");
        System.out.println("Gaji      : Rp" + String.format("%,.2f", hitungGaji()));
    }
}
