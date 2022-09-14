package Ejercicio;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class e6B {
	
	
	public static boolean esBisiesto(int anio) {
		if(anio % 4 == 0 && anio % 100 != 0) {
			return true;
		}else if(anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean esFechaValida(LocalDate fecha) {
		return esBisiesto(fecha.getYear()) ? true : false;
	}
	
	public static String traerFechaCorta(LocalDate fecha) {
		return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
	}
	
	
	public static String traerHoraCorta(LocalTime hora) {
		return hora.getHour() + ":" + hora.getMinute(); 
	}
	
	public static boolean esDiaHabil(LocalDate fecha) {
		int dia = fecha.getDayOfWeek().getValue();
		return (dia >= 1 && dia <=5 );
		
	}
	
	public static String traerDiaDeLaSemana(LocalDate fecha) {
		if(fecha.getDayOfWeek().getValue() == 1) {
			return "Lunes";
		}else if(fecha.getDayOfWeek().getValue() == 2) {
			return "Martes";
		}else if(fecha.getDayOfWeek().getValue() == 3) {
			return "Miercoles";
		}else if(fecha.getDayOfWeek().getValue() == 4) {
			return "Jueves";
		}else if(fecha.getDayOfWeek().getValue() == 5) {
			return "Viernes";
		}else if(fecha.getDayOfWeek().getValue() == 6) {
			return "Sabado";
		}else if(fecha.getDayOfWeek().getValue() == 7) {
			return "Domingo";
		}else {
			return "Error en fecha";
		}
	}



public static String traerMesEnLetras(LocalDate fecha) {
		if(fecha.getMonthValue() == 1) {
		return "Enero";
		}else if(fecha.getMonthValue() == 2) {
			return "Febrero";
		}else if(fecha.getMonthValue() == 3){
			return "Marzo";
		}else if(fecha.getMonthValue() == 4){
			return "Abril";
		}else if(fecha.getMonthValue() == 5){
			return "Mayo";
		}else if(fecha.getMonthValue() == 6){
			return "Junio";
		}else if(fecha.getMonthValue() == 7){
			return "Julio";
		}else if(fecha.getMonthValue() == 8){
			return "Agosto";
		}else if(fecha.getMonthValue() == 9){
			return "Septiembre";
		}else if(fecha.getMonthValue() == 10){
			return "Octubre";
		}else if(fecha.getMonthValue() == 11){
			return "Noviembre";
		}else if(fecha.getMonthValue() == 12){
			return "Diciembre";
		}else {
			return "Error en mes";
		}
	}
	
	public static String traerFechaLarga(LocalDate fecha) {
		return traerDiaDeLaSemana(fecha) + " " + fecha.getDayOfMonth() + " de " + traerMesEnLetras(fecha) + " del " + fecha.getYear(); 
	}
	
	public static int traerCantDiasDeUnMes (int anio, int mes) {
		if(mes == 1) {
			return 31;
		}else if(mes == 2) {
			return 28;
		}else if(mes == 3) {
			return 31;
		}else if(mes == 4) {
			return 30;
		}else if(mes == 5) {
			return 31;
		}else if(mes == 6) {
			return 30;
		}else if(mes == 7) {
			return 31;
		}else if(mes == 8) {
			return 31;
		}else if(mes == 9) {
			return 30;
		}else if(mes == 10) {
			return 31;
		}else if(mes == 11) {
			return 30;
		}else if(mes == 12) {
			return 31;
		}
		else {
			return -1;
		}
	}
	
	public static double aproximar2Decimal(double valor) {
		return Math.round(valor*100.0)/100.0;
	}
	
	
	public static boolean esNumero(char c) {
		int []array= {'0','1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<=9;i++) {
			if(c==array[i]) {
				return true;
			}
		}
		return false;
	}
	
	//public static boolean esLetra(char c) {
		//char []array= {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		//for(int i=0;i<array.length;i++) {
		//	if(array[i]==c) {
		//		return true;
		//	}
		//}
		//return false;
	//}


	public static boolean esLetraWhile(char c) {
		char []arrayChar= {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		boolean booleano=false;
		int i=0;
		while(i < arrayChar.length && booleano==false) {
			if(arrayChar[i]==c) {
				booleano=true;
			}
			i++;
		}
		return booleano;
	}
	
	
	public static boolean esCadenaNros(String cadena) {
		int []array= {'0','1','2','3','4','5','6','7','8','9'};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<cadena.length();j++) {
				if(cadena.charAt(j)==array[i]) {
					return true;
				}
			}
		}
		return false;
	}
	
	 public static boolean esCandenaLetras(String cadena){
		 char []arrayChar= {'a', 'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		 int tam=0;
		 for(int i=0;i<arrayChar.length;i++) {
			 for(int j=0;j<cadena.length();j++) {
				 if(cadena.charAt(j)==arrayChar[i]){
					 tam++;
				 }
			 }
		 }
		 //return tam==cadena.length() ? true : false; 
		 return tam==cadena.length();
	 }
	
	
}