
public class Mensaje implements Facturable{
private Fecha fecha;
private double precio;

public Mensaje(){
	fecha=new Fecha();
	precio=0;
}
public Mensaje(Fecha fecha, double precio){
	this.fecha=fecha;
	this.precio=precio;
}
public Fecha getFecha() {
	return fecha;
}
public void setFecha(Fecha fecha) {
	this.fecha = fecha;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

public double importe(){
	double importe=this.precio;
	return importe;
}

public String toString(){
	return this.fecha.toString()+" "+this.importe();
}

}