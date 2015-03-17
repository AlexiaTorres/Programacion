import java.util.Random;

public class Poligono {
private Vertice v [];

//con este constructor INICIALIZO el array
public Poligono(int tam){
	int aux1, aux2;
	Random rand=new Random(System.nanoTime());
	v=new Vertice[tam];
	
	for(int i=0; i<tam; i++){
		aux1=rand.nextInt(10);
		aux2=rand.nextInt(10);
		
		v[i]=new Vertice(aux1,aux2);
	}
}

public void visualizar(int i){
	System.out.println("x= "+v[i].getX()+" y= "+v[i].getY());
	}

}
