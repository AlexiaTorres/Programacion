//5 minutos
public class Ejercicio01 {
public static void main(String[] args) {
	int n=5;
	int resto=0;
	Lista l1=new Lista();
	for(int i=0; i<=8; i++){
		resto=n%2;
		n=n/2;
		l1.addPrincipio(resto);
	}
	l1.visualizar();
	
}
	
	
	
}
