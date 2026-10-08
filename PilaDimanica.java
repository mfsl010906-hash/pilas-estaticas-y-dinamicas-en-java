public class PilaDimanica {
    Nodo cima; //declarando un nodo llamado cima. el control remoto que apunta al elemento

    //Constructor de la pila
    public PilaDimanica() {

        this.cima = null; //arranca vacia
    }

    // metodo push (meter el elemento arriba)
    void push(int x) {
        Nodo nuevo = new Nodo(x); //1. creamos el nuevo nodo.
        nuevo.siguiente = cima;   //2. como tiene las mismas propiedades que nodo no necesita
        //el nuevo atrapa al viejo de la clase
        cima = nuevo;             //3. actualizamos la cima
        System.out.println("metiste a la pila dinamica: " + x);
    }

    //nota: nueva.siguiente es la flecha
    //metodo pop (sacar el elemento de arriba)
    void pop() {
        if (!isEmpty()) {
            System.out.println("sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; //la cima se baja al siguiente nodo
        } else {
            System.out.println("¡pila dinamica vacia!");
        }
    }

    //metodo Mostrar (recorriendo con el explorador)
    void mostrar() {
        if (isEmpty()) {
            System.out.println("la pila dimamica esta vacia. ");
            return;
        }
            Nodo actual = cima; // nuestro explorador arranca en la cima
            System.out.println("pila dinamica (cima -> fondo): ");

            while (actual != null) {//mientras no llegemos al fondo (null)
                System.out.print(actual.dato + " ");
                actual = actual.siguiente; //saltamos al siguiente nodo
            }
            System.out.println();//salto de linea
        }

// Verificar si la cima no contiene nodos (cima == null)
public boolean isEmpty() {
    return cima == null;
}

// Consultar el valor en la cima sin desvincular el nodo
public int peek() {
    if (!isEmpty()) {
        return cima.dato;
    } else {
        System.out.println("Pila vacía, no hay elemento en la cima.");
        return -1;
    }
}
}