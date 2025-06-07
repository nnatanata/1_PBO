/*
    Nama File   : Senjata.java
    Deskripsi   : Kelas untuk merepresentasikan senjata yang memiliki bunyi tembakan, kemampuan menusuk (bayonet), dan jumlah peluru.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    // Konstruktor tanpa parameter
    public Senjata() {
        this.bunyi = "";
        this.menusuk = false;
        this.peluru = 0;
    }

    // Konstruktor dengan parameter
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    // Getter
    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public int getPeluru() {
        return peluru;
    }

    // Setter
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
