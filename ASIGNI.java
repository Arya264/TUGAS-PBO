/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Selasa 20 February 2024
*/

/*Deskripsi :	*/
/* Program ini berisi contoh sederhana untuk mendefinisikan 
Variabel-variabel bilangan bulat (short int, int, long int, karakter, bilangan riil) */

public class ASIGNI {
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* KAMUS */
		short ks = 1;
		int ki=1;
		long kl = 10000;
		char c=65; 
/*inisialisasi karakter dengan integer*/
		char c1= 'Z';
/*inisialisasi karakter dengan karakter */
		double x= 50.2f;
		float y= 50.2f;
	/*Algoritma */
	/*Penulisan karakter sebagai karakter*/
	System.out.println("Karakter = "+ c);
	System.out.println("Karakter = "+ c1);
	
	/*Penulisan karakter sebagai integer*/
	System.out.println("Karakter = "+ c);
	System.out.println("Karakter = "+ c1);
	
	System.out.println ("Bilangan integer (short) = "+ ks);
	System.out.println ("\t(int) = "+ ki);
	System.out.println ("\t(long)= "+ kl);
	System.out.println ("Bilangan Real x = "+ x);
	System.out.println ("Bilangan Real y = "+ y);
	}
}

