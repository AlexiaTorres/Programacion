public class Ejercicio5 {

public static void main(String[] args) {

int a[]={3,1,3,2,1};
int aux;
int pos;
int suma=0;
int media=0;
int n=a.length;
//ordenar
for(int i=0; i<n-1; i++){
	for(int j=0; j<n-1-i; j++){
		if(a[j+1]<a[j]){
			aux=a[j+1];
			a[j+1]=a[j];
			a[j]=aux;
		}
	}
}

//ver ordenado
for(int i=0; i<n; i++){
	System.out.println(a[i]);
}
System.out.println();

//calcular media
for(int i=0; i<n; i++){
	suma=suma+a[i];
}
media=suma/n;

for(int i=0; i<n; i++){
	if(a[i]==media){
		borrar(a, n, a[i]);
	}
}


//vuelvo a ver sin la media
for(int i=0; i<n; i++){
	System.out.println(a[i]);
}

	
}

/********************************************/
public static int buscar(int a[],int n, int dato){
	int pos=-1;
	int i=0;
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
