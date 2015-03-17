
public class Reloj implements Contador{
	public static void main(String[] args) {
		Reloj r1=new Reloj(9,12,00);
		System.out.println(r1.toString());
	    r1.Temporizador();
	    System.out.println(r1.toString());
	}
	
	
	private int hh,mm,ss;
	
	public Reloj(){
		this.hh=00;
		this.mm=00;
		this.ss=00;
	}
	
	public Reloj(int hh, int mm, int ss){
		this.hh=hh;
		this.mm=mm;
		this.ss=ss;
	}

public void iniciar(Object o) {	
	Reloj r1=(Reloj)o;
	r1.hh=00;
	r1.mm=00;
	r1.ss=00;
}
public Object leerValor() {
	return null;
}

public void incrementar() {
	ss++;
    if (ss==60) {
       ss=0;   
       mm++;
       if (mm==60) {
          mm=0;
          hh=(hh+1) % 24;
       }
    }
}

public void Temporizador(){
		
	while(hh>0){
		if(this.ss==0){
			this.ss=60;
			this.mm--;
		}
		if(this.mm==0){
			this.hh--;
		}
		this.ss--;
		System.out.println(hh+":"+mm+":"+ss);
	}
}

 public String toString(){
	 return this.hh+":"+this.mm+":"+this.ss;
 }
}

