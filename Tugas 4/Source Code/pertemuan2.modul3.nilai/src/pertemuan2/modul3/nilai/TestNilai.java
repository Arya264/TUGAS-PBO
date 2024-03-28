package pertemuan2.modul3.nilai;
import java.util.Scanner;
public class TestNilai {
    public static void main(String[] args){
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[]=new int[banyakData];
        System.out.println("Pilihan : ");
        System.out.println("1.Input Nilai");
        System.out.println("2.Input Nilai Baru");
        System.out.print("Masukkan Pilihan : ");
        int pilih = input.nextInt();
        switch(pilih){
        case 1:            
            hitung.inputNilai(nilai);
            System.out.print("Daftar Nilai : ");
            hitung.cetakNilai(nilai);
            System.out.println("Rata Nilai : "+ hitung.rataNilai(banyakData));
            break;
        case 2:
            hitung.inputNilaiBaru(banyakData);
            System.out.print("Daftar Nilai Baru : ");
            hitung.cetakNilaiBaru();
            break;
        default:
            System.out.print("Pilihan anda salah");
    }
 } 
}
