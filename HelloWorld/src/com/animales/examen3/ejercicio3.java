package com.animales.examen3;

public class ejercicio3 {
	public static void main(String[] args) {
		//Ejercicio3: escribe un programa que declare tres variables de nombre a, b y c, con valoresde tipo entero. 		Acontinuación:1. Escribe una sentencia que muestre por pantalla la suma de las tres variablesutilizando 		System.out.println.
		//2. Cambia el valor de la variable c.
		//3. Escribe de nuevo una sentencia que muestre por pantalla la suma de las tresvariables utilizando 			System.out.printf.

		int a=10, b=23, c=5;
		
		System.out.println(a+b+c);
		
		c=20;
		System.out.println(c);
		
		System.out.printf("%d + %d + %d = %d", a, b, c, a+b+c).println();
		
}
}