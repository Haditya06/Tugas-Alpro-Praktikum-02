import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        
        int sisa;
        int uangBayar, totalBelanja, kembalian;
        int ceban, geceng, noceng, seceng, gopek, nopek, cepek, gocap;

        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan jumlah total beli: ");
        totalBelanja = inp.nextInt();
        System.out.print("Jumlah uang yang dibayarkan: ");
        uangBayar = inp.nextInt();

        kembalian = uangBayar - totalBelanja;
        sisa = kembalian;

        ceban = sisa / 10000;
        sisa = sisa % 10000;
        geceng = sisa / 5000;
        sisa = sisa % 5000;
        noceng = sisa / 2000;
        sisa = sisa % 2000;
        seceng = sisa / 1000;
        sisa = sisa % 1000;
        gopek = sisa / 500;
        sisa = sisa % 500;
        nopek = sisa / 200;
        sisa = sisa % 200;
        cepek = sisa / 100;
        sisa = sisa % 100;
        gocap = sisa / 50;
        sisa = sisa % 50;

        System.out.println("Total kembalian: Rp " + kembalian);
        System.out.println("Rincian lembar uang:");
        System.out.println("Lembar Rp.10000 : " + ceban);
        System.out.println("Lembar Rp.5000  : " + geceng);
        System.out.println("Lembar Rp.2000  : " + noceng);
        System.out.println("Lembar Rp.1000  : " + seceng);
        System.out.println("Lembar Rp.500   : " + gopek);
        System.out.println("Lembar Rp.200   : " + nopek);
        System.out.println("Lembar Rp.100   : " + cepek);
        System.out.println("Lembar Rp.50    : " + gocap);
    }
}
