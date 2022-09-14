package Test;

import java.time.LocalDate;
import java.time.LocalTime;

import Ejercicio.e6B;
import Ejercicio.e6C;

public class TestE6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		LocalDate fecha=LocalDate.of(2022, 8, 31);
		System.out.println(e6B.traerFechaCorta(fecha));
		
		LocalTime hora = LocalTime.of(21, 29); 
		System.out.println(e6B.traerHoraCorta(hora));
		
		System.out.println(e6B.traerDiaDeLaSemana(fecha));
		
		System.out.println(e6B.traerMesEnLetras(fecha));
		
		
		System.out.println(e6B.traerFechaLarga(fecha));
		
		double valor=7435.98462323;
		
		System.out.println(e6B.aproximar2Decimal(valor));
		
		System.out.println(e6B.esNumero('5'));
		
		//System.out.println(e6B.esLetra('a'));
	
		System.out.println(e6B.esLetraWhile('1'));
		
		System.out.println("comprueba----------------------");
		System.out.println(e6B.esCadenaNros("hola"));
		System.out.println("comprueba----------------------");
		
		System.out.println(e6B.esCandenaLetras("1hola"));
		*/
		System.out.println("----------PRUEBA E6C--------------");
		e6C ejerc = new e6C(19);
		System.out.println(ejerc.esPrimo());
	}
}
