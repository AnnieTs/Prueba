package com.andrea.pruebas;

public class U1{
	public static void main(String arg[]){
		U2 ref1 = new U2();         //declara un objeto de U2 que es quien va a llamar las operaciones realizadas en U2
		ref1.ejemploPideDatos();    //ref1 llama clase "ejmploPideDatos"
		ref1.impresionSuma();  //ref1 llama clase "impresionSuma"
	}
}