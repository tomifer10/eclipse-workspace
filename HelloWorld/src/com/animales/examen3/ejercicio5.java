package com.animales.examen3;

public class ejercicio5 {
	public static void main(String[] args) {
		//Ejercicio5:escribe un programa que dado 4 n?meros imprima por pantalla cu?l es el mayor
		
		int a=10 , b=5 , c=23 , d=13;
		
		if (a>b && a>c && a>d) {
			System.out.println("A es el mayor");
		}
		else if (b>a && b>c && b>d) {
			System.out.println ("B es el mayor");
		}
		else if (c>a && c>b && c>d) {
			System.out.println ("C es el mayor");
			
		}
		else {
			System.out.println ("D es el mayor");
		}
}
}