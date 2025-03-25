/*
    Nama File   : Karyawan.java
    Deskripsi   : Abstract class yang merepresentasikan karyawan.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Maret 2024
*/

public abstract class Karyawan extends CivitasAkademika {
    /***********ATRIBUT***************/
    protected String NIP;
    protected int masaKerja;

    /***********METHOD***************/
    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    //Getter dan setter
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}
