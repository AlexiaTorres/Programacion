
public class Alumno implements Comparable {
	private String nombre;
	private String dni;
	private int notaBd;
	private int notaPro;
	private int notaEntor;
	
	public Alumno (){
		
	}
	public Alumno(String nombre, String dni, int notaBd, int notaPro, int notaEntor){
		this.nombre=nombre;
		this.dni=dni;
		this.notaBd=notaBd;
		this.notaPro=notaPro;
		this.notaEntor=notaEntor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getNotaBd() {
		return notaBd;
	}
	public void setNotaBd(int notaBd) {
		this.notaBd = notaBd;
	}
	public int getNotaPro() {
		return notaPro;
	}
	public void setNotaPro(int notaPro) {
		this.notaPro = notaPro;
	}
	public int getNotaEntor() {
		return notaEntor;
	}
	public void setNotaEntor(int notaEntor) {
		this.notaEntor = notaEntor;
	}
	public int compareTo(Object o){
		Alumno a=(Alumno)o;
		return this.nombre.compareTo(a.nombre);
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", notaBd="
				+ notaBd + ", notaPro=" + notaPro + ", notaEntor=" + notaEntor
				+ "]";
	}
	public double media(){
		int suma=this.notaPro+this.notaBd+this.notaEntor;
		double media=suma/3.0;
		return media;
		
	}
	
	

}