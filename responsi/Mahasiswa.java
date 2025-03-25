/*
    Nama File   : Mahasiswa.java
    Deskripsi   : Merepresentasikan mahasiswa universitas.
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 25 Maret 2024
*/

public class Mahasiswa extends CivitasAkademika {
    /***********ATRIBUT***************/
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    public static int count = 0;

    /***********METHOD***************/
    //Konstruktor
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        count++;
    }

    //Getter dan setter
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        double diskon = 0.05 * (semester - 1);
        if (diskon > 1) diskon = 1;
        return fakultas.getTarifUKT() * (1 - diskon);
    }

    @Override
    public void printInfo() {
        System.out.println("=== Mahasiswa ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Email    : " + email);
        System.out.println("NIM      : " + NIM);
        System.out.println("Semester : " + semester);
        System.out.println("Fakultas : " + fakultas.getNama());
        System.out.println("Biaya UKT: Rp" + String.format("%,.2f", hitungUKT()));
    }
}
