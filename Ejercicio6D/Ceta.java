package Ejercicio6D;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Ceta {
	
	private int idCeta;
	private GregorianCalendar fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTransferencia;
	private boolean firmaComprador;
	
	//CONSTRUCTOR
	public Ceta(int idCeta, GregorianCalendar fecha, Contribuyente vendedor, Contribuyente comprador, double valorDeTransferencia, boolean firmaComprador) throws Exception{
		this.idCeta=idCeta;
		this.fecha=fecha;
		this.setComprador(comprador);
		this.setVendedor(vendedor);
		this.valorDeTransferencia=valorDeTransferencia;
		this.firmaComprador=firmaComprador;
	}

	
	//SETTERS AND GETTERS
	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Contribuyente getVendedor() {
		return vendedor;
	}

	public void setVendedor(Contribuyente vendedor) throws Exception {
		if(vendedor.equals(comprador)) throw new Exception("Comprador es igual al vendedor");
		this.vendedor = vendedor;
	}

	public Contribuyente getComprador() {
		return comprador;
	}

	public void setComprador(Contribuyente comprador) throws Exception {
		if(comprador.equals(vendedor)) throw new Exception("Comprador es igual al vendedor");
		this.comprador = comprador;
	}

	public double getValorDeTransferencia() {
		return valorDeTransferencia;
	}

	public void setValorDeTransferencia(double valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}

	public boolean isFirmaComprador() {
		return firmaComprador;
	}

	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}

	public int getIdCeta() {
		return idCeta;
	}


	@Override
	public String toString() {
		return "Ceta [idCeta=" + idCeta + ", fecha=" + fecha.DATE + "/"+ fecha.MONTH +"/" + fecha.YEAR + ", vendedor=" + vendedor + ", comprador=" + comprador
				+ ", valorDeTransferencia=" + valorDeTransferencia + ", firmaComprador=" + firmaComprador + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(comprador, vendedor);
	}


	public boolean equals(Contribuyente contribuyente) {
		return comprador.getCuil().equals(vendedor.getCuil());
	}
	
	
	//METODOS

	
	
}
