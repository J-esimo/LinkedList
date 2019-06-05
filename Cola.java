public class Cola <T> extends ListaDoblementeEnlazada{
    public Cola(){
        super();
    }
    public void encolar(T dato){
        Nodo nodo = new Nodo(dato);
        insertarFinal(dato);
    }
    public void desencolar(){
        eliminarPrincipio();
    }
}
