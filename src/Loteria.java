public class Loteria implements Comparable<Loteria> {
    private int inversion;
    private int premio;

    public Loteria (int inversion, int ganancias) {
        this.inversion = inversion;
        this.premio = ganancias;
    }

    public int getInversion() {
        return this.inversion;
    }

    public  int getPremio() {
        return this.premio;
    }

    public String toString() {
        return this.getInversion() + " ( " + getPremio() + " )";
    }

    @Override
    public int compareTo(Loteria other) {
        if (this.inversion == other.getInversion()){
            return this.premio - other.getPremio();
        } return this.inversion - other.getInversion();
    }
}