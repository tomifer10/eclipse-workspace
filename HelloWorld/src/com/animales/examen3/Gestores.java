package com.animales.examen3;
import java.util.Scanner;

public class Gestores {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int numero =0;
		System.out.println("---\n"
				+ "1. Agregar gestor\r\n"
				+ "2. Modificar gestor\r\n"
				+ "3. Eliminar gestor\r\n"
				+ "4. Ver gestor\r\n"
				+ "5. Ver gestores\r\n"
				+ "6. Salir\r\n");
		
		while (numero !=6) {
			System.out.println("Introduzca un número: ");
			numero =keyboard.nextInt();
			if (numero == 1) {
				System.out.println("1--> Agregar Gestor");
			} else if (numero == 2) {
				System.out.println("2--> Modificar Gestor");
			} else if (numero == 3) {
				System.out.println("3--> Eliminar Gestor");
			} else if (numero == 4) {
				System.out.println("4--> Ver Gestor");
			} else if (numero == 5) {
				System.out.println("5--> Ver Gestores");
			}
		}
		System.out.println("6--> Salir");
		keyboard.close();
	}
	}