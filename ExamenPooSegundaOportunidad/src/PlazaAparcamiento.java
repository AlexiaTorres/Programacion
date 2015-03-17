
public class PlazaAparcamiento implements Comparable{
int numeroPlaza;
String matricula;
Fecha fechaEntrada, fechaSalida;
Hora horaEntrada, horaSalida;

public PlazaAparcamiento(){
	this.numeroPlaza=0;
	this.matricula="";
	this.fechaEntrada=new Fecha();
	this.fechaSalida=new Fecha();
	this.horaSalida=new Hora();
	this.horaSalida=new Hora();
}

public PlazaAparcamiento(int numeroPlaza, String matricula, Fecha fechaEntrada, Fecha fechaSalida, Hora horaEntrada, Hora horaSalida){
	this.numeroPlaza=numeroPlaza;
	this.matricula=matricula;
	this.fechaEntrada=fechaEntrada;
	this.fechaSalida=fechaSalida;
	this.horaEntrada=horaEntrada;
	this.horaSalida=horaSalida;
	}

public int getNumeroPlaza() {
	return numeroPlaza;
}

public void setNumeroPlaza(int numeroPlaza) {
	this.numeroPlaza = numeroPlaza;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public Fecha getFechaEntrada() {
	return fechaEntrada;
}

public void setFechaEntrada(Fecha fechaEntrada) {
	this.fechaEntrada = fechaEntrada;
}

public Fecha getFechaSalida() {
	return fechaSalida;
}

public void setFechaSalida(Fecha fechaSalida) {
	this.fechaSalida = fechaSalida;
}

public Hora getHoraEntrada() {
	return horaEntrada;
}

public void setHoraEntrada(Hora horaEntrada) {
	this.horaEntrada = horaEntrada;
}

public Hora getHoraSalida() {
	return horaSalida;
}

public void setHoraSalida(Hora horaSalida) {
	this.horaSalida = horaSalida;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}







}
