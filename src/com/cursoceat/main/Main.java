package com.cursoceat.main;

import java.util.Scanner;

import com.cursoceat.model.Dias;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dias d = null ;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Indique el día de la semana");
	System.out.println("1- Lunes... 7- Domingo");
    int opcion = entrada.nextInt();

	 switch (opcion) {
	 case 1 -> d=Dias.LUNES;
	 case 2 -> d=Dias.MARTES;
	 case 3 -> d=Dias.MIÉRCOLES;
	 case 4 -> d=Dias.JUEVES;
	 case 5 -> d=Dias.VIERNES;
	 case 6 -> d=Dias.SÁBADO;
	 case 7 -> d=Dias.DOMINGO;
	 default -> System.out.println("Entrada no válida");
	 }
	//METODOS PARA IMPRIMIR EL ENUM
	System.out.println(d.name());//este solo lo muestra
	System.out.println(d.toString());//este lo pasa a string
	System.out.println(d.ordinal());//devuelve la posicion
	for (Dias dM: Dias.values()) {//devuelve todo el enum
		System.out.print(dM + " ");
	}
	
	System.out.println();
	//declaramos otro dia
	System.out.println("Indique el día de la semana");
	System.out.println("1- Lunes... 7- Domingo");
    opcion = entrada.nextInt();
	
    //si el enum es muy extenso 
    Dias otroDia =Dias.values()[opcion-1];
	System.out.println("El otro día es "+ otroDia.name());
	
	// Lunes... Domingo metodo compareTo
	System.out.println(d.compareTo(otroDia));
	if(d.compareTo(otroDia)>0) {
		System.out.println("El "+ d.toString() + " es después de " + otroDia.toString());
	}else {
		System.out.println("El "+ otroDia.toString() + " es después de " + d.toString());

	}
	
	if (d.equals(Dias.VIERNES)) {
		System.out.println("Por fin viernes... llega el finde");
	}
	if (otroDia.equals(Dias.LUNES)) {
		System.out.println("Que fastidio... a trabajar...!!");
	}
	
	
	
	
	
	entrada.close();
	}

}
