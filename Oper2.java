/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Selasa 20 February 2024
*/

/*Pemakaian beberapa operator terhadap relational dan bit*/
public class Oper2 {
	public static void main(String[] args) {
	//TODO Auto-generated method stub
	/*KAMUS*/
	char i,j;
	/*Algoritma*/
	i = 3; /*00000011 dalam biner*/
	j = 4; /*00000100 dalam biner*/
	System.out.println("i = "+ (int) i);
	System.out.println("j = "+ j);
	System.out.println("i & j = "+(i & j));
	/* 0: 00000000 biner */
	System.out.println("i | j = "+(i | j));
	/* 7 : 00000111 biner */
	System.out.println("i ^ j = "+(i ^ j));
  	/* 7 : 00000111 biner ingat!!! operator "^" pada bahasa java bukan
sebagai pangkat*/
	System.out.println(Math.pow(i, j));
	/*Class math memiliki method pow(a,b) untuk pemangkatan*/
	System.out.println("~i = "+ ~i);
	/* ~4: 11111100 biner */

  }
}