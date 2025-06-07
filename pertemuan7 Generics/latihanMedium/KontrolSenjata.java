/*
    Nama File   : KontrolSenjata.java
    Deskripsi   : Kelas untuk mengontrol objek Senjata, termasuk cek peluru, mengisi peluru, menembak, dan memasang bayonet.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 29 April 2025
*/

public class KontrolSenjata {
    private Senjata senjata;

    // Konstruktor
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        int total = senjata.getPeluru() + jumlah;
        senjata.setPeluru(total);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                int sisa = senjata.getPeluru() - 1;
                senjata.setPeluru(sisa);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
