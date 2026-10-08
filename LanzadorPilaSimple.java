public class LanzadorPilaSimple {
    public static void main(String[] args) {
        PilaSimple p =new PilaSimple();

        System.out.println("¿esta vacia la pila estatica?: " + p.isEmpty());

        p.push( 10);
        p.push(20);
        p.push(30);
        p.mostrar();

        System.out.println("elemento en el tope (peek): " + p.peek());
        System.out.println("¿esta llena la pila estatica?: " + p.isFull());

        p.pop(); // saca el 30
        p.mostrar();
        System.out.println("nuevo elemento en el tope (peek): " + p.peek());
    }
}
