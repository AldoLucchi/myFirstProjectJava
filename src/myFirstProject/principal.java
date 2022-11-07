package myFirstProject;
import java.util.Scanner;


public class principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte numeroByte;
		short numeroShort;
		int numeroInt;
		long numeroLong;
		float numeroFloat;
		double numeroDouble;
		boolean logico;
		char caracter;
		String cadena;
		
		System.out.print("Escriba un numero [-128, 127]: ");
		numeroByte = scanner.nextByte();
		System.out.println("Escribio " + numeroByte);
		
		System.out.print("Escriba un numero [-32.768, 32.767]: ");
		numeroShort = scanner.nextShort();
		System.out.println("Escribio " + numeroShort);
		
		System.out.print("Escriba un numero [-2147483648, 2147483647]: ");
		numeroInt = scanner.nextInt();
		System.out.println("Escribio " + numeroInt);
		
		System.out.print("Escriba un numero [-9223372036854775808, 9223372036854775807]: ");
		numeroLong = scanner.nextLong();
		System.out.println("Escribio " + numeroLong);
		
		System.out.print("Escriba un numero [-1.4E-45, 3.4028235E38 ]: ");
		numeroFloat = scanner.nextFloat();
		System.out.println("Escribio " + numeroFloat);
		
		System.out.print("Escriba un numero [-4.9E-324, 1.7976931348623157E308 ]: ");
		numeroDouble = scanner.nextDouble();
		System.out.println("Escribio " + numeroDouble);
		
		System.out.print("Escriba un valor logico [true, false]:" );
		logico = scanner.nextBoolean();
		System.out.println("Declaro " + logico);
		
		System.out.print("Escriba una letra: ");
		caracter = scanner.next().charAt(0);
		System.out.println("Escribiste la letra " + caracter);
		scanner.nextLine();
		
		System.out.print("Escriba una o varias palabras: ");
		cadena = scanner.nextLine();
		System.out.print("Estas declarando la siguiente cadena " + cadena );
		scanner.close();
	}
}
