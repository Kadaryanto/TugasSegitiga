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
        System.out.println();
        // Untuk Membentuk Segitiga Piramida (Sama Kaki)
        System.out.println("Piramida : ");
        for (int i=1;i<=x;i++){
            for(int j=x;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Untuk Membentuk Segitiga Siku - siku Kanan Atas
        System.out.println("Siku Kanan Atas : ");
        for (int b=x; b>=0; b--)
        {
            for (int k=0; k<=b; k++)
            {
        System.out.print("*");
        
            }
            System.out.println("");
            for (int o=x; o>=b; o--)
            {System.out.print(" ");
            }
        }
        
        
    }
    
}
