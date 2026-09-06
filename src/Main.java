public class Main {
    public static void main(String[] args) {
        ListStack pila = new ListStack();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println(pila); // [30, 20, 10]
        System.out.println("Tope: " + pila.peek()); // 30
        System.out.println("Tamaño: " + pila.size()); // 3

        System.out.println("Pop: " + pila.pop()); // 30
        System.out.println(pila); // [20, 10]

        System.out.println("¿Contiene 10? " + pila.search(10)); // true
        System.out.println("¿Contiene 99? " + pila.search(99)); // false

        pila.clear();
        System.out.println("¿Vacía? " + pila.isEmpty()); // true
    }
}