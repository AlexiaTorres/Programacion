public class Ejercicio03{
public static void main(String[] args)  throws NoHayPares, NoHayImpares{
	int a[]={2,4,6,8,10};
	int n=5;
	int m=10;
	int b[]={1,3,5,7,9};
	int c[]={1,2,3,4,5,6,7,8,9,10};
	Lista par=new Lista();
	Lista impar=new Lista();
	
	//paresImpares(a, n, par, impar);
	//paresImpares(b, n, par, impar);
	paresImpares(c, m, par, impar);
	par.visualizar();
	System.out.println();
	impar.visualizar();
}




public static void paresImpares(int a[], int n, Lista par, Lista impar) throws NoHayPares, NoHayImpares{
	Nodo p=par.getInicio();
	Nodo imp=impar.getInicio();
	for(int i=0; i<n; i++){
		if(a[i]%2==0){
		par.addPrincipio(a[i]);
		}else{
			impar.addPrincipio(a[i]);
		}
	}
	
	if(par.getInicio()==null){
		throw new NoHayPares("No hay pares en el array");
	}
	if(impar.getInicio()==null){
		throw new NoHayImpares("No hay impares en el array");
	}
	
}

}
