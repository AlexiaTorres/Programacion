
public class Hora {
	private int hora;
	private int minuto;

	public Hora(){
		hora=0;
		minuto=0;
	}

	public Hora(int hora, int minuto){
		this.hora=hora;
		this.minuto=minuto;
	}
	
	

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public String toString(){
		return this.hora+":"+this.minuto;
	}
}
