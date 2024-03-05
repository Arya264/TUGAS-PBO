/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Senin 5 Maret 2024
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1{
	public static void main(String[] args){
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	String Nim="";
	String Nama="";
	String Jurusan="";
	String Fakultas="";
	
	try{
	System.out.print("Masukkan Nama : ");
	Nama=input.readLine();
	System.out.print("Masukkan Nim : ");
	Nim=input.readLine();
	System.out.print("Masukkan Jurusan : ");
	Jurusan=input.readLine();
	System.out.print("Masukkan Fakultas : ");
	Fakultas=input.readLine();
	}catch (Exception e){}
	
	System.out.println("=====================");
	System.out.println("Nama    : "+ Nama);
	System.out.println("Nim     : "+ Nim);
	System.out.println("Jurusan : "+ Jurusan);
	System.out.println("Fakultas: "+ Fakultas);

  }
}
