package pboif2.pkg10119079.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: coding sorting nilai
 *
 */
public class PBOIF210119079Latihan23NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int min,max, mhs;
        
        
        
        System.out.printf("Masukan Nama Petugas : ");
        String petugas = input.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        mhs = input.nextInt();
        
        int[] bmhs = new int[mhs];
        
        
        for (int i = 0; i < mhs; i++){
            System.out.print("Nilai Mahasiswa Ke-" + (i+1) + " : ");  
            bmhs[i] = input.nextInt();
        }
        max = bmhs[0];
        min = bmhs[0];
        for (int i = 0; i < mhs; i++){
            if(bmhs[i] > max){
                max = bmhs[i];
            }
            else if (bmhs[i] < min){
                min = bmhs[i];
            }
        }
        System.out.println("Nilai max = " + max);
        System.out.println("Nilai min = " + min);  
    }
    
}
