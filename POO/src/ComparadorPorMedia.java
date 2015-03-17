import java.util.Comparator;


public class ComparadorPorMedia implements Comparator {
	public int compare( Object o1, Object o2){
		Alumno a1=(Alumno)o1;
		Alumno a2=(Alumno)o2;
		double m1=a1.media();
		double m2=a2.media();
		if(m1>m2)
			return 1;
		else if(m1<m2)
			return -1;
		else return 0;
		
	}

}