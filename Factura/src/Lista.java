
public class Lista {
private Nodo inicio;

public Lista(){
	inicio=null;
}

public Lista(Nodo inicio){
	this.inicio=inicio;
}

public Nodo getInicio(){
	return inicio;
}

public void add(Facturable f){
	Nodo p=new Nodo(f);
	p.setSig(inicio);
	inicio=p;
}

public String toString(){
	Nodo p=inicio;
	String s="";
	while(p!=null){
		s=s+p.getInfo().toString()+"-->";
		p=p.getSig();
	}
	return s;
}

public double importe(){
	double imp=0;
	Nodo p=inicio;
	while(p!=null){
		imp=imp+p.getInfo().importe(); //importe es el metodo de facturable
	}
	return imp;
}
}