package com.app.f1;

public class Strings {
	public static void main(String[] args) {
		String string1="Hola";
		String string2="Adios";
		String substringABC= "abc hahahah abc hahahaha abc";
		if (string1.charAt(0)== string2.charAt(0)) {
			System.out.println("Los caracteres son iguales");
			
		
		}else {
			System.out.println("Los caracteres no son iguales");
		}
		//Ejercicio: escribe un programa que dado dos String compruebe si los dos primeros
		//caracteres y los dos ?ltimos son iguales.	
		
		if (string1.charAt(0)== string2.charAt(0)&& string1.charAt(3)== string2.charAt(3)) {
			System.out.println("El primer y el ultimo caracter coinciden");
			
		
		}else {
			System.out.println("El primer y ultimo caracter no coinciden");
		}
		
		//Ejercicio: escribe un programa que compruebe que el substring "abc" se encuentra en un
		//String dado, pero no puede encontrarse ni al comienzo, ni al final.
		
		if (substringABC.indexOf("abc")!= -1 && substringABC.indexOf("abc")!=0){
			System.out.println("");
			
		
		}else {
			System.out.println("abc no esta ni al principio ni al final");
		}
		
		//Ejercicio escribe un programa que devuelva si un String es pal?ndromo (se escribe igual
		//hacia delante y hacia detr?s). Ejemplo: "sometemos".
		
		String palin ="sometemos";
		String palinReverse="";
		int indiceRecorre = palin.length()-1;
		for (int i=indiceRecorre;i>0;i--) {
			palinReverse=palin.substring(indiceRecorre);
			
			
		}
		if (palin.equals(palinReverse)) {
			System.out.println("Es un palindromo");
		}
	}}
