package com.andrea.pruebas;

import java.util.Scanner;

public class U2 {
	
	public void impresionSuma(){
		int n1, n2;
		n1=6; 
		n2=2;                                            //declaración de n1 y n2
		System.out.println("La suma es: " + (n1 + n2));  //impresión de suma
		
	}
	
	public void ejemploPideDatos(){
		Scanner scanner = new Scanner(System.in);      //declaración de scanner
		System.out.println("Escribe tu nombre: ");     //pide nombre
		String nombre = scanner.nextLine();            //pide "nombre"=variable
		System.out.println("Hola " + nombre);
		scanner.close();                               //se debe cerrar forzosamente
	}
}