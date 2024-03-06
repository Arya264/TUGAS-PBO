/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Senin 5 Maret 2024
*/

import java.util.Scanner;

public class PrintXWhile{
/**
* @param args
*/
public static void main(String[] args){
	int Sum;
	int x;
	Scanner masukan=new Scanner(System.in);
	Sum=0;

	System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
	x=masukan.nextInt();
	while(x != 999){
	System.out.print("Kasus kosong \n");
	Sum=Sum+x;
	System.out.print("Masukkan nilai x(int), akhiri dg 999 : ");
	x=masukan.nextInt();
	}
	System.out.println("Hasil penjumlahan = "+ Sum); 

 }
}