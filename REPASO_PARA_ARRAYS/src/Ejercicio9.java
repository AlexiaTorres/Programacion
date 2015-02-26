/*Llenar array con los seis primeros numeros de
 * la serie de fibonacci. Buscar el mayor.
 * Indicar su poscion e intercambiarlo con el siguiente*/
public class Ejercicio9 {

	public static void main(String[] args) {
	int c=0;
	int f1=1;
	int f2=1;
	int n=6;
	int aux;
	int a[]=new int[n];
	
for(int i=0; i<n; i++){	
	while(c<n){
		f1=f2-f1;
		f2=f1+f2;
		a[i]=f2;
		System.out.println("["+a[i]+"]");
		c++;
	}
}


int mayor=buscarMayor(a, n);


	}
	
	
	public static int buscarMayor(int a[], int n){
		int posMayor=0;
		int i=1;
		int mayor=a[posMayor];
		while(i<=n-1){
			if(a[i]>mayor){
				posMayor=i;
				mayor=a[posMayor];
			}
			i++;
		}
		return mayor;
	}

}
