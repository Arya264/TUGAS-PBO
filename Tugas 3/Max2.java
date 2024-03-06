/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Senin 5 Maret 2024
*/

import java.util.Scanner;

public class Max2{
/**
* @param args
*/
public static void main(String[] args){
	int a, b;
	Scanner masukan=new Scanner(System.in);

	System.out.print("Maksimum dua bilangan : \n");
	System.out.print("Ketikan dua bilangan, pisahkan dg RETURN : \n");
	a=masukan.nextInt();
	b=masukan.nextInt();
	System.out.println("Ke dua bilangan : a = "+ a+" b = "+b);
	if(a>=b){
	System.out.println("Nilai a yang maksimum "+ a);
	}else /* a>b */{
	System.out.println("Nilai b yang maksimum: "+ b);
	}

  }
}
