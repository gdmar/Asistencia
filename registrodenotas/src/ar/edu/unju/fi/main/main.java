package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;


public class main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 Alumno alumno = new Alumno();
	
		 
		 System.out.print("ingrese apellido del alumno");
		 String apellido = scan.next();
		 System.out.print("ingrese nombre del alumno");
		 String nombre = scan.next();
		 System.out.print("ingrese numero de legajo del alumno");
		 String legajo = scan.next(); 
		 
		 
		 alumno.setApellido(apellido);
		 alumno.setNombre(nombre);
		 alumno.setLegajo(legajo);
		 
		 System.out.println(alumno.toString());
		 
		 int numMaterias =1;
		 
		 while(numMaterias <=2 ) {
			 
			 System.out.print("ingrese codigo de la materia");
			 String codigoMat = scan.next();
			 System.out.print("ingrese nombre de la materia");
			 String nombreMat = scan.next();
			 
			Materia materia = new Materia(codigoMat,nombreMat);
			
			System.out.print("ingrese codigo de la nota final");
			String codigo = scan.next();
			System.out.print("ingrese nota final: ");
			Float notaf = scan.nextFloat();
			
			RegistroNotas notas = new RegistroNotas(codigo, alumno, materia, notaf);
			
			System.out.println(notas.toString());
			 
			 numMaterias++;
		 }
	}
	 

}
