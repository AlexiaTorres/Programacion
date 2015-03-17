/*Diseñar un metodo eliminarPares() de la clase
 * Lista que elimine los nodos de la lista que
 * contienen un número par
 * 
 * public int eliminarPares()
 * 
 */
public class Ejercicio02 {
public static void main(String[] args) {
	Lista l1=new Lista();
	l1.addPrincipio(3);
	l1.addPrincipio(14);
	l1.addPrincipio(7);
	l1.addPrincipio(4);
	l1.addPrincipio(12);
	
	l1.visualizar();
	System.out.println("----------------");
	
	l1.eliminarPares();
	l1.visualizar();
	
}
}
