package Ejercicio6D;

public class Contribuyente {
	private int idContribuyente;
	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;
	
	
	//CONSTRUCTOR
	public Contribuyente(int idContribuyente ,String apellido, String nombre, long dni,char sexo, String cuil) throws Exception {
		this.idContribuyente=idContribuyente;
		setApellido(apellido);
		setNombre(nombre);
		setDni(dni);
		this.setSexo(sexo);
		setCuil(cuil);
	}

	
	//GETTERS AND SETTERS
	public int getIdContribuyente() {
		return idContribuyente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) throws Exception{
		
		//if(sexo != 'f' && sexo != 'm') throw new Exception("Error: Sexo no puede ser distinto a 'f' o 'm'");
		this.sexo=sexo;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) throws Exception {
		if(!validarCuil(cuil)) throw new Exception("El cuil es invalido");
		this.cuil = cuil;
	}


	@Override
	public String toString() {
		return "Contribuyente [idContribuyente=" + idContribuyente + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", dni=" + dni + ", sexo=" + sexo + ", cuil=" + cuil + "]";
	}
	
	public boolean validarSexo(char sexo) {
		boolean bool=true;
		if(sexo != 'f' && sexo != 'm') {
			bool=false;
		}
		return bool;
	}
	
	public boolean validarCuil(String cuil) throws Exception {
		if(cuil.length() != 11) throw new Exception ("El tamanio del cuil es distinto a 11 digitos");
		
		
		int numeroCuilMultiplicar[]= {5,4,3,2,7,6,5,4,3,2};
		String genero = "20";
		int sexo=20;
		
		if(this.sexo == 'f') {
			genero= "27";
			sexo=27;
		}
		
		
		String dni=cuil.substring(2, 10);
		genero=genero.concat(dni);
		
		int tam=0;
		int suma=0;
		while(tam < numeroCuilMultiplicar.length) {
			suma = suma+(Character.getNumericValue(genero.charAt(tam)) * numeroCuilMultiplicar[tam]);
			tam++;
		}
		
		
		String z;
		
		if(suma % 11 == 0) {
			z="0";
		}else if(suma % 11 == 1) {
			z="9";
			genero="23";
			genero=genero.concat(dni);
			if(sexo==27) {
				z="4";
			}
		}else {
			z = String.valueOf(11 - (suma % 11));
			
		}
		
		genero=genero.concat(z);
		return (genero.equals(cuil));
	}
}
