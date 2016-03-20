package com.vhz.sesion02.test;

import com.vhz.sesion02.dominio.Ciudad;
import com.vhz.sesion02.dominio.Fecha;
import com.vhz.sesion02.dominio.Persona;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha(16, 1, 1989);
		Fecha f2 = new Fecha(22, 10, 1972);
		
		Ciudad cn1 = new Ciudad(73, "Chiclayo");
		Ciudad cn2 = new Ciudad(01, "Lima");
		
		Ciudad cr1 = new Ciudad(44, "Trujillo");
		Ciudad cr2 = new Ciudad(44, "Trujillo");
		
		Persona per1 = new Persona(45502803, "Gonzalo", "Vasquez Hernandez", f1, cn1, cr1);	
		Persona per2 = new Persona(12345678, "Juan", "Perez", f2, cn2, cr2);

		System.out.print("PERSONA 1: " + per1.toString());
		System.out.print("PERSONA 2: " + per2.toString());
		
	}

}
