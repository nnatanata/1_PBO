/*
    Nama File   : Student.java
    Deskripsi   : Kelas turunan dari Person yang merepresentasikan seorang mahasiswa dengan perilaku tidur yang berbeda.
    Pembuat     : Code dari modul
    Tanggal     : 22 April 2025
*/

public class Student extends Person
{
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) { 
        return 2 < hr && 8 > hr; 
    }
}
