/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Senin 5 Maret 2024
*/

import java.util.Scanner;

public class Scanner1{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	String Nim, Nama, Jurusan, Fakultas;
	
	System.out.print("Masukkan Nama : ");
	Nama=input.nextLine();
	System.out.print("Masukkan Nim : ");
	Nim=input.nextLine();
	System.out.print("Masukkan Jurusan : ");
	Jurusan=input.nextLine();
	System.out.print("Masukkan Fakultas : ");
	Fakultas=input.nextLine();

	System.out.println("====================");
	System.out.println("Nama    : "+ Nama);
	System.out.println("Nim     : "+ Nim);
	System.out.println("Jurusan : "+ Jurusan);
	System.out.println("Fakultas: "+ Fakultas);
  }
}

