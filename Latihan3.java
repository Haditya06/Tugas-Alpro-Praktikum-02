import java.util.Scanner;

public class Latihan3 {
	public static void main(String[] args) {

		double celcius;

		Scanner inp = new Scanner(System.in);
		System.out.print("masukan suhu celcius: ");
		celcius = inp.nextDouble();

		double fahrenhait = (9.0 / 5.0) * celcius + 32;
		double reamur = 4.0 / 5.0 * celcius;
		double kelvin = celcius + 273;

		System.out.println("suhu dalam celcius\t: " + celcius);
		System.out.println("suhu dalam reamur\t: " + (float)reamur);
		System.out.println("suhu dalam fahrenhait\t: " + fahrenhait);
		System.out.println("suhu dalam kelvin\t: " + kelvin);


	}
}