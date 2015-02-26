/*
 * Crear un array con los 40 primeros pares
 * y borrar los divisibles entre 10
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int par;
		int contPares;
		int aux;
		int n;
		
		//sacar el tamaño del array
		par=2;
		contPares=0;
		aux=par;
		while(contPares<40){
			if(par%2==0){
				contPares++;
			}
			par++;
		}
		n=contPares;
	//llenar array de pares	
		int a[]=new int[n];
		par=aux;
		for(int i=0; i<n; par++){
			if(par%2==0){
				a[i]=par;
				i++;
			}
		}
	System.out.println("Array con los 40 primeros pares:");	
	visualizar(a, n);		

	System.out.println();	
	System.out.println("Borrar los divisibles entre 10");
	for(int i=0; i<n; i++){
		if(a[i]%10==0){
		borrar(a, n, a[i]);	
		}
	}

	visualizar(a, n);
	
	
	}
	
	
/****************************/	
public static void visualizar(int a[], int n){
	for(int i=0; i<n; i++){
		System.out.println(i+"["+a[i]+"]");
	}
}

public static int buscar(int a[], int n, int dato){
	int i=0;
	int pos=-1;
	while(i<=n-1 && pos==-1){
		if(a[i]==dato){
			pos=i;
		}
		i++;
	}
	return pos;
}
	
public static void borrar(int a[], int n, int dato){
	int pos=buscar(a, n, dato);
	int i=pos;
	while(i<=n-2){
		a[i]=a[i+1];
		i++;
	}
	a[n-1]=0;
	n--;
}
	
}





/*


	
*/	
