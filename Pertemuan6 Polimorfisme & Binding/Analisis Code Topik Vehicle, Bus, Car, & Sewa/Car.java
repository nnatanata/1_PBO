/*
    Nama File   : Car.java
    Deskripsi   : Kelas turunan dari Vehicle yang merepresentasikan mobil dan menghitung harga sewa dengan diskon.
    Pembuat     : Code dari modul
    Tanggal     : 28 April 2025
*/

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.0F;
        System.out.println("harga sewa mobil = " + fare);
    }
}