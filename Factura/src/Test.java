
public class Test {
  public static void main(String[] args) {

Fecha f1=new Fecha(11,3,2015);
Fecha f2=new Fecha(18,3,2015);

Llamada l1=new Llamada(f1,10.3,20);
Llamada l2=new Llamada(f2,0.58,3);
Llamada l3=new Llamada(f2,4.15,7);

Mensaje m1=new Mensaje(f1,0.50);
Mensaje m2=new Mensaje(f1,0.50);
Mensaje m3=new Mensaje(f2,0.50);

Lista l=new Lista();

l.add(l1);
l.add(m3);
l.add(m2);
l.add(l3);
l.add(m1);
l.add(l2);

l1.importe();  l2.importe();  l3.importe();
m1.importe();  m2.importe();  m3.importe();

System.out.println(l.toString());

System.out.println(l1.importe());

}
}
