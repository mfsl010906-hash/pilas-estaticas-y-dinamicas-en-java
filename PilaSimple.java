public class PilaSimple {
    int [] datos = new int [5]; // capacidad fija de 5 a 4
    int tope = -1;              //empieza vacia

    //1. meter dato (push) //llenar la pila
    void push(int x) {
        if (!isFull()){
        tope++;
        datos[tope] = x;
        System.out.println("Metiste: " + x);
    } else {
        System.out.println("¡pila llena!");
    }
}

//2. sacar dato (pop)
void pop() {
    if (!isEmpty()) {
        System.out.println("sacaste: " + datos[tope]);
        tope--;
    } else {
        System.out.println("¡pila vacia!");
    }
}

//3. ver pila
    void mostrar() {
        if (isEmpty()) {
            System.out.println("la pila esta vacia. ");
            return;
        }
        System.out.println("pila actual: ");
        for (int i = 0; i <= tope; i++) {
            System.out.printf(datos[i] + " ");
        }
        System.out.println();
    }

// Verificar si la pila está vacía (tope == -1)
public boolean isEmpty() {
    return tope == -1;
}

// Verificar si el arreglo alcanzó su límite (tope == datos.length - 1)
public boolean isFull() {
    return tope == datos.length - 1;
}

// Consultar el elemento en el tope sin eliminarlo
public int peek() {
    if (!isEmpty()) {
        return datos[tope];
    } else {
        System.out.println("Pila vacía, no hay tope para consultar.");
        return -1; // Valor por defecto o indicador
    }
}
}