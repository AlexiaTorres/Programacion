/*array de caracteres y borrar las vocales*/
public class Ejercicio8 {
 public static void main(String[] args) {
	char a[]={'z','b','a','r','o','p'};
	int n=a.length;
	for(int i=0; i<n; i++){
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
			borrar(a, n, a[i]);
		}
	}
	
	
	for(int i=0; i<n; i++){
		System.out.println(a[i]);
	}
	
	
}

	
	
public static int buscar(char a[], int n, char dato){
	int pos=-1;
	int i=0;
	while(i<n && pos==-1){
		if(a[i]==dato){
			pos=i;
		}
	i++;
	}
return pos;
}

public static void borrar(char a[], int n, char dato){
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
