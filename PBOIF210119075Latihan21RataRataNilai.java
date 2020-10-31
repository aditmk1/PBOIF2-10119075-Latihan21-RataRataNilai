/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan21.rataratanilai;
import java.util.Scanner;
/**
 * @author  
 * Nama  : Aditiya Musthafa Kamil
 * Kelas : PBOIF2
 * NIM   : 10119075
 * Deskripsi Program : Program ini berisi program yang menampilkan Program Rata-Rata Nilai
 **/
public class PBOIF210119075Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int i, n;
        float jumlah,x, rata;
        System.out.print("Masukkan Banyaknya Mahasiswa :");
        n = masuk.nextInt();
        jumlah = 0;
        i = 1;
        while (i<=n){
            System.out.print("Nilai Mahasiswa ke-"+i+": ");
            x = masuk.nextFloat();
            jumlah += x;
            i++;
            
        }
        rata = jumlah / n;
        System.out.println("Maka,Rata-rata Nilainya adalah : " + rata);
        System.out.println("========================================");
        System.out.println("Developed by Aditiya Musthafa Kamil");
        
    }
    
}
