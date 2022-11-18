package pakage;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Util.subrayar("EJERCICIO 07 MODULAR", "*");

		int num;
		boolean resultado;
		int contador;

		num = Util.leerInt("Introduzca un número: ");
		resultado = esPrimo(num);
		contador = Cont(num);

		if (resultado == true) {
			Util.escribir("El número introducido es primo");
		} else {
			Util.escribir("El número introducido NO es primo");
		}
		Util.escribir("El número de divisores que tiene este número es: " + contador);
	}

	public static boolean esPrimo(int num) {

		boolean resultado = true;

		for (int i = 2; i <= (num - 1); i++) {

			if (num % i == 0) {
				resultado = false;

			}
		}

		return resultado;
	}

	public static int Cont(int num) {

		int contador = 0;

		for (int i = 2; i <= (num - 1); i++) {

			if (num % i == 0) {
				contador++;
			}

		}

		return contador;
	}

}