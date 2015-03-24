
public class Llamada implements Facturable{
private Fecha fecha;
private double tarifa;
private int duracion;

public Llamada (){
	fecha=new Fecha();
	tarifa=0;
	duracion=0;
}

public Llamada(Fecha fecha, double tarifa, int duracion){
	this.fecha=fecha;
	this.tarifa=tarifa;
	this.duracion=duracion;
}

public Fecha getFecha() {
	return fecha;
}

public void setFecha(Fecha fecha) {
	this.fecha = fecha;
}

public double getTarifa() {
	return tarifa;
}

public void setTarifa(double tarifa) {
	this.tarifa = tarifa;
}

public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public double importe(){
	double importe= this.tarifa*this.duracion;
	return importe;
}

public String toString() {
return this.fecha.toString()+" "+this.importe();		
}




}