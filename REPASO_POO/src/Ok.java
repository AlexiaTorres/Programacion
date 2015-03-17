public class Ok {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6,7,8,9,10,0,0,0,0,0,0,0,0,0,0,0};
		int n = 10;
		visualizar(a, n);
		n = borrarImpares(a,n,7);
		System.out.println("/////////////");
		visualizar(a,n);
		
	}
	
	public static int borrarImpares(int []a, int n, int dato){
		for (int i = 0; i < n; i++) {
			if (a[i]==dato){
				for (int j = i; j < n-1; j++) {
					a[j] = a[j+1];
				}
				n--;
				i--;
			}
			
		}
		
		return n;
	}
	
	public static void visualizar(int []a, int n){
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}