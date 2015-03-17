
public class PuntoLista {
int x,y;
Nodo inicio;
Nodo a,b;

public PuntoLista(){
	x=0;
	y=0;
	a=new Nodo(x);
	b=new Nodo(y);
	inicio=null;
}

public PuntoLista(int x, int y){
	this.x=x;
	this.y=y;
	a=new Nodo(x);
	b=new Nodo(y);
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public void addX(int x){
Nodo p=new Nodo(x);
p.setSig(inicio);
inicio=p;
}

public void addY(int y){
	Nodo p,q;
	q=new Nodo(y);
	p=inicio;
	while(p.getSig() != null){
		p=p.getSig();
	}
	p.setSig(q);
}

public String toString(){
	String s="";
	Nodo p=inicio;
	
		while(p!=null){
			System.out.println(s+""+p);
			p=p.getSig();
		};
		return s;
}

public boolean equals(Object o){
	PuntoLista p=(PuntoLista)o;
	if(this==p){
		return true;
	}else{
		return false;
	}
}

public void distanciaAlOrigen(){
	double d;
	d=Math.sqrt((Math.pow(getX(), 2))+(Math.pow(getY(), 2)));
	System.out.println(d);
}
public void distanciaOtroPunto(PuntoLista p){
double distancia=Math.sqrt(Math.pow((p.getX()-this.getX()),2)+Math.pow((p.getY()-this.getY()),2));
System.out.println(distancia);
}



private int compareTo(Object o) {
	PuntoLista p=(PuntoLista)o;
	int resp= p.compareTo(this);
	return resp;
}


}
