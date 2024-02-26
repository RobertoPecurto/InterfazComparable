public class Tutankamon implements Comparable<Tutankamon>{
    private int valor;
    private int peso;
    private String nombre;
    private int contador = 0;

    public Tutankamon (int contador, String nombre, int valor, int peso) {
        this.valor = valor;
        this.peso = peso;
        this.nombre = nombre;
        this.contador = contador;
    }

    public int getValor() {
        return this.valor;
    }

    public  int getPeso() {
        return this.peso;
    }
    public String getNombre() {return this.nombre;}
    public  int getContador() {return this.contador;}

    public String toString() {
        return this.getNombre() + " " + this.getValor() + " " + this.getPeso();
    }
    @Override
    public int compareTo(Tutankamon other) {
        if (this.peso == other.getPeso() && this.valor == other.getValor()){
            return this.contador - other.getContador();
        } else if (this.valor == other.getValor()) {
            return this.peso - other.getPeso();
        } else return this.valor -getValor();
    }
}
