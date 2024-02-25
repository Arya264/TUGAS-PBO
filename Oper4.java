/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Selasa 20 February 2024
*/

/*Operator Terner*/
public class Oper4 {
	public static void main(String[] args) {
	//TODO Auto-generated method stub
	/*Kamus*/
	int i = 0; /*Perhatikan int i,j=0 bukan seperti ini*/
	int j = 0;
	char c = 8; char d = 10;
	int e = (((int)c > (int)d) ? c : d);
	int k = ((i>j) ? i:j);
	/*Algoritma*/
	System.out.print("Nilai e = "+ e);
	System.out.print("\nNilai k = "+ k);
	i = 2;
	j = 3;
	k = ((i++>j++) ? i : j);
	System.out.print("\nNilai k = "+ k);
 }
}
