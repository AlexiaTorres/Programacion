import java.util.Scanner;

/*Calcular la letra del dni. Se cogerá el resto de dividir el dni entre 23
 * tiene que ser un numero entre 0 y 22. Haz un metodo donde segun
 * el resultado de esa fórmula busque en un array de caracteres la posicion
 * que corresponda*/
public class Ejercicio11 {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce DNI, sin letra");
	int dni=teclado.nextInt();
	int n=23;
	int aux=dni;
	char a[]={'T','R','V','A','G','M','Y','F','P','D','D','B'
			,'N','J','Z','S','Q','V','H','L','C','K','E'};
	while(dni>22){
		dni=dni%23;
	}
	
    System.out.println(aux);
    buscarLetra(a, n, dni);
    
	}

public static void buscarLetra(char a[], int n, int dato){
	int i=0;
	int pos=-1;
	char letra=' ';
	while(i<=n-1 && pos==-1){
		if(i==dato){
			letra=a[i];
		}
		i++;
	}
	System.out.println(letra);
}
	
}
