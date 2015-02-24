package plantsvrszombies;

/**
 *
 * @author Glendy
 */
public class Nodo {
private int dato;
private Nodo siguiente;

public Nodo(){
    dato =0;
    siguiente = null;

}

public void insertarNodo(Nodo nuevo){
    siguiente = nuevo;
}

public void setDato(int a){
    dato = a;
}
public void imprimir(){
System.out.println(dato);
}

public Nodo getNodo(){
return siguiente;
}
}


