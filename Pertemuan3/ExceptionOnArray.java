/* Nama File    : ExceptionOnArray.java
    Deskripsi   : Program penggunaan eksepsi menggunakan class library java
    Pembuat     : Shofi Rasyida Nata
    NIM         : 24060123120007
    Tanggal     : 4 Maret 2024 */

public class ExceptionOnArray {
   public static void main(String[] args){
    //instansiasi object array integer
    Integer[] arrayInteger = new Integer[4];
    try{
        arrayInteger[2]=11;
        arrayInteger[4]=10;
    }catch(ArrayIndexOutOfBoundsException exception){
        exception.printStackTrace();
    }finally{
        System.out.println("clean up code...");
    }
   } 
}
