/*
 * Nama : Kadaryanto
 * NIM  : 12141372
 */
import java.util.Scanner;

public class TugasSegitiga {
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Masukkan Jumlah Karakter : ");
        int x = input.nextInt();
        // Untuk Membentuk Segitiga Siku-siku Kiri Bawah
        System.out.println("Siku Kiri Bawah : "); 
        for (int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"); // Mencetak Karakter Bintang
            }
            System.out.println();
        }
        // Untuk Membentuk Segitiga Siku - siku Kanan Bawah
        System.out.println("Siku Kanan Bawah : ");
        for (int i=0;i<=x;i++){
            for(int j=0;j<=x - i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
       
        
        
    }
    
}
