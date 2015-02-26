/*array con los 20 primeros números primos
 * ordenarlo de mayor a menor
 * si hay alguno divisible entre 5 crear un nuevo array
 * con la posicion en la que está */
public class Ejercicio13 {
public static void main(String[] args) {
int a[]=new int[20];
int num=1;
int cp=0;
boolean primo;
int i,j;
int aux;
int tam=0; //tamaño nuevo array
int posicion[];
int n=a.length;

//relleno con los 20 primeros primos
while(cp<20){
 for(i=0; i<a.length; num++){
    primo=primo(num);
		if(primo){
			a[i]=num;
			cp++;
			i++;
		}
	}
 }	
visualizar(a,n);
//ordeno de mayor a menor
 for(i=0; i<a.length-1; i++){
	 for(j=0; j<a.length-1-i; j++){
		 if(a[j+1]>a[j]){
			 aux=a[j+1];
			 a[j+1]=a[j];
			 a[j]=aux;
		 }
	 }
 }
 System.out.println("\nOrdenado de mayor a menor:");
 visualizar(a,n);
//saco el tamaño del array de posiciones
 for(i=0; i<a.length; i++){
	 if(a[i]%5==0 || a[i]%7==0){
		 tam++;
	 }
 }
 
//buscar divisible entre 5 y creo uno cn su posicion
 posicion=new int[tam];
 j=0;
 while(j<tam){
	 i=0;
		while(i<a.length){
	 if(a[i]%5==0 || a[i]%7==0){
		 posicion[j]=i;
		 j++;
	 }
	 i++;
	 }
 }
 System.out.println("\nPosiciones de divisbles entre 5 y 7");
 visualizar(posicion,tam);
}

	
	
/**********************************************/
public static boolean primo(int num){
int c=0;
int d=1;
	while(d<=num){
    	if(num%d==0){
		c++;
		}
	d++;
	}
	if (c<=2){
		return true;
	}else{
		return false;
	}
}

//visualizo	
public static void visualizar(int a[],int n){
for(int i=0; i<n; i++){
 System.out.println(a[i]);
}
}

}
