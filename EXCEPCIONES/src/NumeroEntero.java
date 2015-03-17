import java.util.InputMismatchException;
import java.util.Scanner;


public class NumeroEntero {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x;
		
		try{
			System.out.println("Introduce un número entero");
			x=teclado.nextInt();
			System.out.println(x);
		}catch(Exception e){
			System.out.println("No es un número entero");
		}
		

	}

}