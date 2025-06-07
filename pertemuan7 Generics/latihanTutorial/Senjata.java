/*
    Nama File   : Senjata.java
    Deskripsi   : Kelas untuk merepresentasikan senjata dengan fitur menembak dan menusuk (bayonet).
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

package latihanTutorial;

public class Senjata {
    private String bunyi;
    private boolean menusuk;

    // Konstruktor tanpa parameter
    public Senjata() {
        this.bunyi = "DOR";
        this.menusuk = false;
    }

    // Konstruktor dengan parameter
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    // Getter
    public String getBunyi() {
        return bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    // Setter
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // Method menembak
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println();
    }

    // Method pasang bayonet
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    // Method menusuk
    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
