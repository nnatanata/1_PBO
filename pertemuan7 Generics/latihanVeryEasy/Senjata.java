/*
    Nama File   : Senjata.java
    Deskripsi   : Kelas untuk merepresentasikan senjata yang dapat menembak dan memiliki peluru.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    // Konstruktor tanpa parameter
    public Senjata() {
        this.bunyi = "";
        this.peluru = 0;
    }

    // Konstruktor dengan parameter
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    // Getter
    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    // Setter
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    // Method menembak
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru -= 1;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis!");
        }
    }
}
