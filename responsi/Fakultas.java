/*
    Nama File   : Fakultas.java
    Deskripsi   : Merepresentasikan fakultas dalam universitas.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Maret 2024
*/

public class Fakultas {
    /***********ATRIBUT***************/
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    /***********METHOD***************/
    //Konstruktor
    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    //Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void printInfo() {
        System.out.println("=== Info Fakultas ===");
        System.out.println("Nama Fakultas: " + nama);
        System.out.println("Tarif UKT    : Rp" + String.format("%,.2f", tarifUKT));
        System.out.println("Gaji Pokok   : Rp" + String.format("%,.2f", gajiPokok));
    }
}
