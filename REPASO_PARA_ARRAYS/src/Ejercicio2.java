import java.util.Scanner;

/*
 * Leer 10 números por teclado: 5 para un array
 * 5 para otro. Mostrar los 10 en pantalla mediante un solo array
 */
public class Ejercicio2 {
	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

System.out.println("Introduce 10 números enteros:");
int a[]=new int[5];
int b[]=new int[5];
int c[]=new int[10];
int i;


System.out.println("5 para un array");
for(i=0; i<a.length; i++){
	a[i]=teclado.nextInt();
	}
System.out.println("5 para otro");
for(i=0; i<b.length; i++){
	b[i]=teclado.nextInt();
	}


for(i=0; i<a.length; i++){
	c[i]=a[i];
}

for(i=0; i<b.length; i++){
	c[a.length+i]=b[i];
}
	 

	  for (i=0;i<c.length;i++){
	      System.out.println(c[i]);
	  }

	}

}