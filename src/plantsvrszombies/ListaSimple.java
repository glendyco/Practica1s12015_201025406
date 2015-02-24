package plantsvrszombies;

/**
 *
 * @author Glendy
 */
public class ListaSimple {
    
      public static void main(String[] args){
    
        Nodo primero = new Nodo();
        primero.setDato(1);
        primero.imprimir();
        
        Nodo segundo = new Nodo();
        segundo.setDato(2);
        
        primero.insertarNodo(segundo);
        
        primero.getNodo().imprimir();
        
    }
    
}
