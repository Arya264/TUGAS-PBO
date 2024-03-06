/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Senin 5 Maret 2024
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString{
/**
* @param args
*/
public static void main (String[] args) throws IOException{
	String str;
BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\n string dan Integer: \n");
	System.out.print("masukkan sebuah string: ");
	str = datAIn.readLine();
	System.out.print("String yang dibaca : "+ str);
  }
}