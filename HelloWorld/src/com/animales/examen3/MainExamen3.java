package com.animales.examen3;

public class MainExamen3 {

		public static void main(String[] args) {
			Animales Colibri= new Animales(2);
			Animales Leopardo= new Animales(0);
			Animales Delfin= new Animales(0);
			
			System.out.println(Colibri.getalas());
			Delfin.setalas(0);
			System.out.println(Leopardo.getalas());
			Leopardo.setalas(4);
			System.out.println(Delfin.getalas());
			
		}

	}


