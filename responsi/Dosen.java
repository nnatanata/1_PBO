/*
    Nama File   : Dosen.java
    Deskripsi   : Subclass dari Karyawan yang merepresentasikan dosen.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Maret 2024
*/

public class Dosen extends Karyawan {
    /***********ATRIBUT***************/
    private Fakultas fakultas;
    public static int count = 0;

    /***********METHOD***************/
    //Konstruktor
    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        count++;
    }

    //Getter dan setter
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji() {
        double pokok = fakultas.getGajiPokok();
        return pokok + (masaKerja * 0.01 * pokok);
    }

    @Override
    public void printInfo() {
        System.out.println("=== Dosen ===");
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        System.out.println("NIP       : " + NIP);
        System.out.println("Masa kerja: " + masaKerja + " tahun");
        System.out.println("Fakultas  : " + fakultas.getNama());
        System.out.println("Gaji      : Rp" + String.format("%,.2f", hitungGaji()));
    }
}
