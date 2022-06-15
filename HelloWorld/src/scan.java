import java.util.Scanner;

public class scan {
	
	public static void main(String []args) {
		 System.out.println("1.Gestores\n2.Clientes\3.transferencias\n4.Mensajes\n5.Prestamos\n6.Salir\n Introduzca su numero:");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		while (numero != 6) {
			System.out.println("1.Gestores\n2.Clientes\3.transferencias\n4.Mensajes\\n5.Prestamos\n6.Salir\n Introduzca su numero:");
			numero = keyboard.nextInt();
		}
		System.out.println("Programa Finalizado");
		
		keyboard.close();
	
}
}