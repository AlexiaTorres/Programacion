
public class Nodo {
private int info;
private Nodo sig;

public Nodo(){
	info=0;
	sig=null;
}

public Nodo(int info){
	this.info=info;
}

public void setInfo(int info){
	this.info=info;
}
public int getInfo(){
	return info;
}
public void setSig(Nodo sig){
	this.sig=sig;
}
public Nodo getSig(){
	return sig;
}
public String toString(){
	String s="";
	s=this.info+"-->";
	return s;
}


}
