public class ListaDoblementeEnlazada <T> {
    private Nodo <T> inicio;
    private Nodo <T> ultimo;
    private int tam;
    private T d;

    public ListaDoblementeEnlazada(){
        inicio = ultimo = null;
        tam = 0;
    }
    public int getSize(){
        return tam;
    }
    public void insertarPrincipio(T dato){
        Nodo<T> nodo = new Nodo<>(dato);
        if(inicio == null){
            inicio = nodo;
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);
            ultimo = inicio;
        }
        else{
            inicio.setAnterior(nodo);
            nodo.setSiguiente(inicio);
            inicio = nodo;
            inicio.setAnterior(ultimo);
        }
        tam++;
    }
    public T eliminarPrincipio(){
        if(tam > 0){
            T d;
            if(tam == 1){
                d = inicio.getDato();
                inicio = ultimo = null;
            }
            else{
                Nodo aux = inicio;
                d = inicio.getDato();
                inicio.getSiguiente().setAnterior(ultimo);
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
                aux = null;
            }
            tam--;
            return d;
        }
        return null;
    }
    public T eliminarUltimo(){
        if(tam > 0){
            T d;
            if(tam == 1){
                d = inicio.getDato();
                inicio = ultimo = null;
            }
            else{
                Nodo aux = ultimo;
                d = ultimo.getDato();
                ultimo.getAnterior().setSiguiente(inicio);
                ultimo = ultimo.getAnterior();
                inicio.setAnterior(ultimo);
                aux = null;
            }
            tam--;
            return d;
        }
        return null;
    }
    public void recorridoSiguiente(){
        if(tam > 0){
            Nodo aux = inicio;
            do{
                System.out.println(aux.getDato());
                aux = aux.getSiguiente();
            }
            while(aux != inicio);
        }
    }
    public void recorridoAnterior(){
        if(tam > 0){
            Nodo aux = ultimo;
            do{
                System.out.println(aux.getDato());
                aux = aux.getAnterior();
            }while(aux != ultimo);
        }
    }
    public void insertarFinal(T dato){
        Nodo<T> nodo = new Nodo(dato);
        if(inicio == null){
            inicio = nodo;
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);
            ultimo = inicio;
        }
        else{
            ultimo.setSiguiente(nodo);
            nodo.setAnterior(ultimo);
            ultimo = nodo;
            ultimo.setSiguiente(inicio);
        }
        tam++;
    }

}
