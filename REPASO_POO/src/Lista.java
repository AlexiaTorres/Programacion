
public class Lista {
private Nodo inicio;

public Lista(){
	inicio=null;
}

public void addPrincipio(int dato){
Nodo p=new Nodo(dato);
p.setSig(inicio);
inicio=p;
}

public void addFinal(int dato){
	Nodo p,q;
	q=new Nodo(dato);
	p=inicio;
	while(p.getSig() != null){
		p=p.getSig();
	}
	p.setSig(q);
}

public void addMedio(int dato){ //para listas ordenadas
	Nodo nuevo=new Nodo(dato);
	Nodo p,q;
	p=inicio;
	while(p.getInfo() < nuevo.getInfo()){
		p=p.getSig();
	}
	q=inicio;
	while(q.getSig() != p){
		q=q.getSig();
	}
	q.setSig(nuevo);
	nuevo.setSig(p);
}  

public void porPosicion(int dato, int pos){
	Nodo n=new Nodo(dato);
	Nodo p,q;
	p=inicio;
	for(int i=1; i<pos; i++){
		p=p.getSig();
	}
	q=inicio;
	while(q.getSig() != p){
		q=q.getSig();
	}
	q.setSig(n);
	n.setSig(p);
}

public void recorrerLista(){
	Nodo n=inicio;
	while(n != null){
		System.out.println(n);
		n=n.getSig();
	}
}




public void borrar(int dato){
	Nodo p,q;
	if(inicio != null){
		if(inicio.getSig() != null ){
		  if(inicio.getInfo() == dato){
			  inicio=null;
		  }else{
			  p=inicio.getSig();
			  q=
					  inicio;
			  while(p!=null && p.getInfo() != dato){
				  p=p.getSig();
				  q=q.getSig();
			  }
			  if(p!=null){
				  q.setSig(p.getSig());
				  p.setSig(null);
				  p=null;
			  }
		  }
		}
	}

	
}


}
