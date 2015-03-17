import java.util.Comparator;
public class Comparadores implements Comparator {
   public int compare(Object o1, Object o2){
	   Vuelo v1=(Vuelo)o1;
	   Vuelo v2=(Vuelo)o2;
	   
	  int resp;
 resp=v1.getNumeroVuelo() - v2.getNumeroVuelo();
	 
 if(resp==0){
		 resp=v1.getDestino().compareTo(v2.getDestino());       	 
 }
 
   return resp;
   }
	
}
