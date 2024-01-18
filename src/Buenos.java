public class Buenos implements Comparable<Buenos> {
    private int comportamiento;
    private int peso;

    public Buenos (int comportamiento, int peso) {
        this.comportamiento = comportamiento;
        this.peso = peso;
    }

    public int getComportamiento() {
        return this.comportamiento;
    }

    public  int getPeso() {
        return this.peso;
    }

    public String toString() {
        return this.getComportamiento() + " " + this.getPeso();
    }

    @Override
    public int compareTo(Buenos other) {
        if (this.comportamiento == other.comportamiento){
            if (this.peso < other.peso){
                return -1;
            }
            return 1;
        } else {
            if (this.comportamiento < other.comportamiento){
                return 1;
            }else return -1;

        }
    }
}