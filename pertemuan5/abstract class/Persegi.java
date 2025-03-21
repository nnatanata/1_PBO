/*
    Nama File   : Persegi.java
    Deskripsi   : Implementasi class Persegi sebagai subclass BangunDatar
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 18 Maret 2024
*/

public class Persegi extends BangunDatar {
    /***********ATRIBUT***************/
    private double sisi;

    /***********METHOD***************/
    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
    }

    //Getter dan Setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //Implementasi Abstract Method
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    //Method untuk mencetak informasi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
