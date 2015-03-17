import java.util.Comparator;


public class ComparadorPorDni implements Comparator {
	public int compare(Object o1, Object o2){
		Alumno a1=(Alumno)o1;
		Alumno a2=(Alumno)o2;
		String s1=a1.getDni();
		String s2=a2.getDni();
		int respuesta=s1.compareTo(s2);
		return respuesta;
	}

}