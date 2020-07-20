package com.libreria.practicaClase6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digita el número entero que quieres visualizar del algoritmo fibonacci: ");
		int limite = sc.nextInt();
		sc.close();

		for (int i = 0; i < limite; i++) {
			System.out.print(algoritmoFibonacci(i) + ", ");
		}
	}

	private static int algoritmoFibonacci(int num) {
		if (num == 0 || num == 1)
			return num;
		else
			return algoritmoFibonacci(num - 1) + algoritmoFibonacci(num - 2);
	}

}
