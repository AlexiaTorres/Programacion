public class Prueba_Fecha {

	public static void main(String[] args) throws FechaIncorrecta {
		Fecha f1=new Fecha(11,10,1993);
		Fecha f2=new Fecha(12,0,1998);
		
		f1.validarFecha();
		f2.validarFecha();
	}

}