package com.app.strings;

public class Ejercicio421 {

	public static void main(String[] args) {
		//Ejercicio: escribe un programa que concatene dos StringBuilder, utilizando append y
		//también el operador concatenación.
		
		StringBuilder strb1= new StringBuilder("Hola a todos");
		StringBuilder strb2= new StringBuilder("Como estan");
		String str1 = strb1.toString();
		String str2 = strb2.toString();
		
		strb1.append(strb2);
		
		System.out.println(strb1);
		
		String str3= strb1.toString() + strb2.toString();
		System.out.println(str3);
		
		//Ejercicio: escribe un programa que elimine el último carácter de un StringBuilder.
		
		strb1.deleteCharAt(11);
		System.out.println(strb1);
		
		StringBuilder strb4 = new StringBuilder("Ayer cayó un rayo");
	    String conv=strb4.toString();
	    int pos= 0;

	    while (pos<=conv.length()) {
	        char Caract=conv.charAt(pos);
	            if (Caract == ' ') {
	                pos++;
	                //conv.replace(Caract.toUpperCase(Caract));
	               // strb4.toUpperCase(pos);
	            }else {
	                pos++;
	            }
	    }
	}}
