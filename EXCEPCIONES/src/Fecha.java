/*3. Diseñar la clase Fecha con sus constructores, 
 * métodos set y get toString, validarFecha()  se 
 * lanzará una excepción cuando una fecha no sea válida( mes, día y año correctos)
 * 
 */
public class Fecha {
private int dia;
private int mes;
private int año;

public Fecha(int dia,int mes,int año){
	this.dia=dia;
	this.mes=mes;
	this.año=año;
}
	
public String toString(){
	
	
	return this.dia+"/"+this.mes+"/"+this.año;
	
}
	
public void validarFecha()throws FechaIncorrecta{
	if(this.dia>31||this.dia<1||this.mes>12||this.mes<1){
		throw new FechaIncorrecta ("La fecha no es válida");
	}else{
		System.out.println(this);
	}
}
	
	
}