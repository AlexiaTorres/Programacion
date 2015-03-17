import java.util.Comparator;


public class Prueba_Alumno {

	public static void main(String[] args) {
		Alumno a1=new Alumno("pepe","33333",5,3,6);
		Alumno a2=new Alumno("juan","12365",4,6,8);
		Alumno  a3=new Alumno ("aaaaa", "111111",2,2,2);
		Alumno a4=new Alumno("bbbbb","55555",4,4,4);
		Alumno []a= new Alumno[10];
		int n=4;
		a[0]=a1;
		a[1]=a2;
		a[2]=a3;
		a[3]=a4;
		if(a1.compareTo(a2)<0){
			System.out.println("el menor es a1");
			
		}else{
			if(a1.compareTo(a2)>0){
				System.out.println("el menor es a2");
			}
			else{
				System.out.println("son iguales");
			}
		}
		//comparar dos alumnos por dni
		//crear objeto comparador por dni
		ComparadorPorDni c =new ComparadorPorDni();
		int respuesta=c.compare(a2, a2);
		System.out.println(respuesta);
		
		
		
		
		
		
		
		//ordenar
		Comparator c1=new ComparadorPorMedia();
		System.out.println("antes");
		for (int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		System.out.println("despues");
		ordenar(a,n,c1);
		for (int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		

	}
	public static void ordenar (Alumno[]a, int n, Comparator c){
		int i,j;
		Alumno aux;
		int r;
		i=0;
		while (i<n-1){
			j=i+1;
			while(j<n){
				r=c.compare(a[i], a[j]);
				if (r>0){
					aux=a[i];
					a[i]=a[j];
					a[j]=aux;
				}
				j++;
				
			}
			i++;
		}
	}

}