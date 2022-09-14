package Ejercicio6D;

public class Rodado {
	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;
	
	//CONSTRUCTOR
	public Rodado(int idRodado, String dominio, int modelo, String marca) {
		this.idRodado=idRodado;
		this.setDominio(dominio);
		this.setMarca(marca);
		this.setModelo(modelo);
	}
	
	//SETTERS AND GETTERS
	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getIdRodado() {
		return idRodado;
	}
	
	
	
}
