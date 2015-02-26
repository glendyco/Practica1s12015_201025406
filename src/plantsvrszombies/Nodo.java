package plantsvrszombies;

/**
 *
 * @author Glendy
 */
public class Nodo 
{
    Nodo siguiente;
    String dato;
    
    public Nodo(String dato) 
    {
        this.dato = dato;
        this.siguiente = null;
    }    
}
