public class Main {
    public static void main(String[] args) {
        // 1. Creamos nuestra pila vacía usando el constructor
        PilaDimanica miPila = new PilaDimanica();

        System.out.println("¿esta vacia la pila dinamica?: " + miPila.isEmpty());

        System.out.println("*** INSERTANDO ELEMENTOS (PUSH) ***");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);

        // Mostramos cómo quedó la torre
        miPila.mostrar(); // Debe mostrar: 30 20 10 (El 30 está en la cima porque fue el último en entrar)

        System.out.println("elemento en la sima (pekk): " + miPila.peek());

        System.out.println("\n*** SACANDO UN ELEMENTO (POP) ***");
        miPila.pop(); // Debería sacar el 30

        // Mostramos cómo quedó después del pop
        // Debe mostrar: 20 10
        miPila.mostrar();
        System.out.println("nuevo elemnto en la cima (peek): " + miPila.peek());
    }
}