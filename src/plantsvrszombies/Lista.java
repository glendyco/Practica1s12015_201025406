package plantsvrszombies;
import javax.swing.JOptionPane;

/**
 *
 * @author Glendy
 */
public class Lista 
{
    private Nodo primero;
    
    
    public Lista() 
    {
        this.primero = null;
       
    }
    //Lista vacia.
    public boolean siVacio() {
        return (this.primero == null);
    }
    
    //Insertar datos
    public void Insertar(String dato)
    {
        if(siVacio() == true)
        {
            primero = new Nodo(dato);
        }
        else
        {
            boolean f = true;
            Nodo actual = primero;
            while(f == true)
            {
                if(actual.siguiente == null)
                {
                   f = false;
                }
                else
                {
                    actual = actual.siguiente;
                }                    
            }
            
            Nodo nuevo = new Nodo(dato);
            actual.siguiente = nuevo;          
            
        }
    }
    
    //Tamaño de la lista
    public int tamaño()
    {
        boolean f = true;
        Nodo actual = primero;
        int contador = 0;
        
        while(f == true)
        {
                if(actual == null)
                {
                    return contador;
                }
                else
                {
                    actual = actual.siguiente;
                    contador++;
                }                    
        }
        
        return contador;
    }
    
    
    
    //Imprimir lista
    public void imprimir() 
    {
        int tamaño = tamaño();
        if(tamaño != 0) 
        {
            Nodo temp = primero;
            String str = "";
            for(int i = 0; i < tamaño; i++) 
            {
                if(temp.siguiente != null)
                {
                    str = str + temp.dato +" -> "+temp.siguiente.dato+ "\n";
                }
                else
                {
                    str = str + temp.dato +" -> null \n";
                }
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null, str);
            System.out.println(str);
        }
    }
}
