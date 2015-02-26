/*
 * crear array buscar los numeros terminados en
 * tal numero, guardar sus posiciones en otro array
 */
public class Ejercicio10 {
public static void main(String[] args) {
	int a[]={14,13,21,24,54,67,4,6,34};
	int num=4;
	int c=0;
	int i=0;
	int j;
	int posiciones[];
	
   while(i<a.length){
	   if(a[i]%10==num){
		   c++;
	   }
	   i++;
   }
   
   posiciones=new int[c];

	j=0;
	while(j<c){
		i=0;
		while(i<a.length){
		if(a[i]%10==num){
		posiciones[j]=i;
		System.out.println(posiciones[j]);
		}
		i++;
		}
		j++;
	}
	
	
	
	
}	
}