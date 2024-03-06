/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Senin 5 Maret 2024
*/

import java.util.Scanner;

public class PriFor{
/**
* @param args
*/
public static void main(String[] args){
	int i, N;
	Scanner masukan = new Scanner(System.in);
	
	System.out.print("Baca N, print 1 s/d N \n");
	System.out.print("N = ");
	N=masukan.nextInt();
	for (i=1;i<=N;i++){
	System.out.println(i); };
	System.out.println("Akhir program \n");	
  }
}