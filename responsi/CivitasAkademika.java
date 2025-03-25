/*
    Nama File   : CivitasAkademika.java
    Deskripsi   : Abstract class dasar untuk semua civitas akademika.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Maret 2024
*/

public abstract class CivitasAkademika {
    /***********ATRIBUT***************/
    protected String nama;
    protected String email;

    /***********ATRIBUT***************/
    //Konstruktor
    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    //Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void printInfo();
}
