/* Nim : 13020220078
Nama : Muh.Yusran
Hari/Tanggal :Selasa 20 February 2024
*/

/*Contoh pengoperasian variabel bertype dasar*/
public class Oprator {
public static void main(String[] args){
	//TODO Auto-generated stub
	/*Kamus*/
	boolean Bool1, Bool2, TF;
	int i,j, hsl;
	float x,y,res;
	/*Algoritma*/
System.out.println("Silahkan baca teksnya dan tambahkan perintah program dibawah ini untuk menampilkan output program");
	Bool1 = true; Bool2 = false;
	TF = Bool1 && Bool2; /*Boolean AND*/
	TF = Bool1 || Bool2; /*Boolean OR*/
	TF = !Bool1 ; /*NOT*/
	TF = Bool1 ^ Bool2; /*XOR*/
	
	/*operasi numerik*/
	i=5; j=2;
	hsl = i+j;
	hsl = i-j;
	hsl = i*j;
	hsl = i/j; /*pembagian bulat*/
	hsl = i%j; /*sisa modulo*/

	/*Operasi numerik*/
	x=5; y=5;
	res = x+y;
	res = x-y;
	res = x/y;
	res = x*y;

	/*Operasi relasional numerik*/
	TF = (i==j);
	TF = (i!=j);
	TF = (i<j);
	TF = (i>j);
	TF = (i<=j);
	TF = (i>=j);

	/*Operasi relasional numerik*/
	TF = (x != y);
	TF = (x<y);
	TF = (x>y);
	TF = (x<=y);
	TF = (x>=y);

  }
}