
public class Nodo {
private Facturable info;
private Nodo sig;

public Nodo(){
	info=null;
	sig=null;
}

public Nodo(Facturable info){
	this.info=info;
}

public Facturable getInfo() {
	return info;
}

public void setInfo(Facturable info) {
	this.info = info;
}

public Nodo getSig() {
	return sig;
}

public void setSig(Nodo sig) {
	this.sig = sig;
}

public String toString(){
	return this.info.toString();
}


}