/* Nama File    : Asersi1.java
    Deskripsi   : Program untuk menunjukkan asersi
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 4 Maret 2024 */

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if (x>0){
            System.out.println("x bilangan positif");
        }else{
            assert (x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}