public class ListStack implements StackInterface {

    private class NodoPila {
        Object dato;
        NodoPila siguiente;

        NodoPila(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private NodoPila tope;
    private int tamano;

    public ListStack() {
        this.tope = null;
        this.tamano = 0;
    }

    @Override
    public void clear() {
        tope = null;
        tamano = 0;
    }

    @Override
    public boolean isEmpty() {
        return tamano == 0;
    }

    @Override
    public Object peek() {
        if (tope == null) {
            return null;
        }
        return tope.dato;
    }

    @Override
    public Object pop() {
        if (tope == null) {
            return null;
        }
        Object dato = tope.dato;
        tope = tope.siguiente;
        tamano--;
        return dato;
    }

    @Override
    public boolean push(Object object) {
        NodoPila nuevo = new NodoPila(object);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamano++;
        return true;
    }

    @Override
    public int size() {
        return tamano;
    }

    @Override
    public boolean search(Object object) {
        NodoPila actual = tope;
        while (actual != null) {
            if (actual.dato.equals(object)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        NodoPila actual = tope;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}