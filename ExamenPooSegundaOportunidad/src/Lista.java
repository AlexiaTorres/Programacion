public class Lista {
private Nodo inicio;

public Lista(){
	inicio=null;
}

public Nodo getInicio() {
	return inicio;
}

public void addPrincipio(int dato){
Nodo p=new Nodo(dato);
p.setSig(inicio);
inicio=p;
}

public void visualizar(){
	Nodo p=inicio;
	while(p !=null){
		System.out.println(p);
		p=p.getSig();
	}
}


public void borrar(int n){
	Nodo p,q;
	if(inicio != null){
		if(inicio.getSig() != null ){
		  if(inicio.getInfo() == n){
			  inicio=null;
		  }else{
			  p=inicio.getSig();
			  q=
					  inicio;
			  while(p!=null && p.getInfo() != n){
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


public void eliminarPares(){
	Nodo p=inicio;
	while(p !=null){
		if(p.getInfo()%2==0){
			borrar(p.getInfo());
			
		}else{
		p=p.getSig();
	}
	
}
}



}
