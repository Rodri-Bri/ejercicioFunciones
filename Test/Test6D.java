package Test;

import java.util.GregorianCalendar;

import Ejercicio6D.*;

public class Test6D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			GregorianCalendar fecha = new GregorianCalendar();
			Contribuyente comprador= new Contribuyente(0,"Brito","Rodrigo",43390009,'m',"20433900090");
			Contribuyente vendedor= new Contribuyente(0,"Rocio","Lizzaraga",45299409,'f',"27452994092");
			Ceta ceta =new Ceta(0,fecha,comprador,vendedor,2000,true);
			System.out.println(ceta);
			
		}catch(Exception e){
			System.out.println("Excepcion:"+e.getMessage());
		}
	
		
	}

}
