import java.util.Scanner;

/*
 * Leer 5 números en un array. Copiarlos a otro 
 * multiplicados por 2 y ordenarlo
 */
public class Ejercicio3 {

	public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);
int a[]=new int[5];
int b[]=new int[5];
int aux;

System.out.println("Introduce 5 enteros:");
//relleno a[]
for(int i=0; i<a.length; i++){
	a[i]=teclado.nextInt();
}
//copia a[] a b[] multiplicado por 2
for(int i=0; i<b.length; i++){
	b[i]=a[i]*2;
	System.out.println(b[i]);
}
System.out.println();
//ordenar
for(int i=0; i<b.length-1; i++){
	for(int j=0; j<b.length-1-i; j++){
		if(b[j+1]<b[j]){
			aux=b[j+1];
			b[j+1]=b[j];
			b[j]=aux;
		}
	}
}

//ver ordenado
for(int i=0; i<b.length; i++){
	System.out.println(b[i]);
}



	}

}
