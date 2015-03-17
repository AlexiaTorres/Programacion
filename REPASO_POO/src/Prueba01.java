import java.util.Scanner;


public class Prueba01 {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int pos=3;
	Lista l1=new Lista();;
    
	l1.addPrincipio(8);
	l1.addPrincipio(4);
    l1.addPrincipio(2);
    l1.addPrincipio(1);
    l1.addMedio(3);
   l1.porPosicion(11, pos);
    
	l1.recorrerLista();
System.out.println();
	l1.borrar(11);
	l1.recorrerLista();
}
}
