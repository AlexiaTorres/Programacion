import java.util.Comparator;

public class Ejercicio04 implements Comparator{
	public static void main(String[] args) {
		int n=3;
		PlazaAparcamiento parking[] = new PlazaAparcamiento[n];
		Fecha f1 = new Fecha(20,3,1998);
		Hora h1 = new Hora(15,37);
		PlazaAparcamiento p1 = new PlazaAparcamiento(11, "4731GBM" ,f1,f1,h1,h1);
		parking[0]=p1;
		
		Fecha f2 = new Fecha(11,4,2014);
		Hora h2 = new Hora(22,10);
		PlazaAparcamiento p2 = new PlazaAparcamiento(6, "4781GBM" ,f2,f2,h2,h2);
		parking[1]=p2;
		
		Fecha f3 = new Fecha(11,4,2014);
		Hora h3 = new Hora(21,10);
		PlazaAparcamiento p3 = new PlazaAparcamiento(18, "9781GBM" ,f3,f3,h3,h3);
		parking[2]=p3;
		
		
		
		Comparator a = new fechaYhora();
			
		visualizar(parking,n);
		System.out.println("Ordenados por fecha y hora");
		ordenar(parking, 3, a);
		visualizar(parking,n);
		
	}

	public static void visualizar(PlazaAparcamiento parking[],int n) {
		for (int i=0; i<n; i++) {
			System.out.println(parking[i]);
		}
	}
	
	public static void ordenar(PlazaAparcamiento parking[], int n, Comparator a){
		boolean cambios = true;
		while (cambios){
			cambios = false;
			for (int i = 0; i < n - 1; i++) {
				if (a.compare(parking[i], parking[i+1]) < 0){
					cambios = true;
					PlazaAparcamiento aux = parking[i];
					parking[i] = parking[i+1];
					parking[i+1] = aux;
				}
			}
		}	
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
