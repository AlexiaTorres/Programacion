
public class EjercicioJavi {
	public static void main(String[] args) {
		
int a1[]={1,3,4,1,2,4};
int a2[]={1,2};

int i=0;
int j;
int n=a1.length;
int m=a2.length;
int c=0;

while(i<=n-1){
	j=0;
	while(j<=m-1){
		if(a1[i]==a2[j]){
			System.out.println(i);
			c++;
		}
		j++;
	}
	i++;
}

if(c>1){
	System.out.println("Hay "+c+" coincidencias");
}


}
}