package Ejercicio;

public class e6C {
	private int n;
	
	public e6C(int numero) {
		this.n=numero;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public boolean esPrimo() {
		int contador=2;
		boolean booleano=true;
		if(n % 1 == 0 && n > 1) {
			while(contador < n && booleano == true ) {
				
				if((n % contador) == 0) {
					booleano=false;
				}
				contador++;
			}
		}else {
			booleano=false;
		}
		return booleano;
	}
	
}
