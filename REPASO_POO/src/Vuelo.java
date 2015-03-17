import java.util.Comparator;

public class Vuelo implements Comparator {
private int numeroVuelo;
private String destino;
private Fecha fecha;
private Hora hora;

public Vuelo() {
	numeroVuelo=0;
	destino="";
	fecha=new Fecha();
	hora=new Hora();
}

public Vuelo(int numeroVuelo, String destino, Fecha fecha, Hora hora){
	this.numeroVuelo=numeroVuelo;
	this.destino=destino;
	this.fecha=fecha;
	this.hora=hora;
}



public int getNumeroVuelo() {
	return numeroVuelo;
}

public void setNumeroVuelo(int numeroVuelo) {
	this.numeroVuelo = numeroVuelo;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}

public Fecha getFecha() {
	return fecha;
}

public void setFecha(Fecha fecha) {
	this.fecha = fecha;
}

public Hora getHora() {
	return hora;
}

public void setHora(Hora hora) {
	this.hora = hora;
}

public void ordenarVuelos(int v[], int n, Comparator c){
	int aux;
	for(int i=0; i<n-1; i++){
		for(int j=0; j<n-1-i; j++){
			if(v[j+1]<v[j]){
				aux=v[j+1];
				v[j+1]=v[j];
				v[j]=aux;
			}
		}
	}
}
public static void visualizar(int v[], int n){
	for(int i=0; i<n; i++){
		System.out.println(v[i]);
	}
}

public int compare(Object o1, Object o2) {
	Vuelo v1=(Vuelo)o1;
	Vuelo v2=(Vuelo)o2;
	int resp;
	
	resp=v1.getNumeroVuelo()-v2.getNumeroVuelo();
	if(resp==0){
		resp=v1.getDestino().compareTo(v2.getDestino());
	}
	
	return resp;
}
	
	

}
