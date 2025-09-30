import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {

        int hari, tahun, bulan, minggu, sisa;

        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan berapa hari: ");
        hari = inp.nextInt();

        tahun = hari / 365;
        sisa = hari % 365;
        bulan = sisa / 30;
        sisa = sisa % 30;
        minggu = sisa / 7;
        sisa = sisa % 7;

        System.out.println("Berapa Tahun : " + tahun);
        System.out.println("Berapa Bulan : " + bulan);
        System.out.println("Berapa Minggu: " + minggu);
        System.out.println("Berapa Hari  : " + sisa);
    }
}
