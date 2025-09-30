import java.util.Scanner;

public class Latihan6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double panjang, lebar, tinggi, sisi;
		double luas_kubus, keliling_kubus, luas_persegi, keliling_persegi, keliling_lingkaran, luas_lingkaran;
		final double pi = 3.14;

		System.out.print("Tinggi : ");
		tinggi = inp.nextInt();
		System.out.print("Panjang: ");
		panjang = inp.nextInt();
		System.out.print("Lebar: ");
		lebar = inp.nextInt();
		System.out.print("Sisi: ");
		sisi = inp.nextInt();

		keliling_persegi = 4 * sisi;
		luas_persegi = sisi * sisi;
		keliling_kubus = 12 * sisi;
		luas_kubus = 6 * (sisi * sisi);
		keliling_lingkaran = 2 * pi * sisi;
		luas_lingkaran = pi * (sisi * sisi);
		double volume_kubus = sisi * sisi * sisi;

		System.out.println("Keliling persegi: " + (int)keliling_persegi);
		System.out.println("Luas Persegi: " + (int)luas_persegi);
		System.out.println("Keliling Kubus: " + (int)keliling_kubus);
		System.out.println("Luas kubus: " + (int)luas_kubus);
		System.out.println("Volume kubus: " + (int)volume_kubus);
		System.out.println("Keliling Lingkaran: " + (int)keliling_lingkaran);
		System.out.println("Luas lingkaran: " + (int)luas_lingkaran);


	}
}
