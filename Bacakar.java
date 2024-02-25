/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Selasa 20 February 2024
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//impor javax.swing.*;
public class Bacakar {
	/**
	* @param args
	* @throws IOException
	*/
	public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub
	/*Kamus*/
	char cc; int bil;

	InputStreamReader isr = new
	InputStreamReader(System.in);
	BufferedReader dataIn = new BufferedReader(isr);
	//Atau
BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
	/*Algoritma*/
	System.out.print("hello\n");
	System.out.print("baca 1 karakter : ");
	
	//Perintah Baca Karakter cc	
	cc=dataIn.readLine() .charAt(0);
	System.out.print("baca 1 bilangan : ");
	
	//Perintah Baca bil
	bil =Integer.parseInt(datAIn.readLine());

	/*String kar = JOptionPane.showInputDialog("Karakter 1 : ");
	System.outprintl(kar);*/
	//JOptionPane.showMessageDialog(null,"hello");
	
	System.out.print(cc +"\n" +bil+"\n");
	System.out.print("bye \n");
  }

}