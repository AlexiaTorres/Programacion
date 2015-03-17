
public class Ejercicio05 {

	public static void main(String[] args) {
	PuntoLista p1=new PuntoLista();
	PuntoLista p2=new PuntoLista();
	p1.addX(8);
	p1.addY(7);
	p2.addX(2);
	p2.addY(5);
	p1.toString();

	boolean equal=p1.equals(p2);
	if(equal==true){
		System.out.println("Los puntos son iguales");
	}else{
		System.out.println("Los puntos son distintos");
	}
	
	p1.distanciaAlOrigen();
	p1.distanciaOtroPunto(p2);
	
	}
	
	

}
