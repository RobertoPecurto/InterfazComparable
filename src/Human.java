public class Human implements Comparable<Human> {
    private String name;
    private int cantidad;

    public Human (String name, int analfabetos) {
        this.name = name;
        this.cantidad = analfabetos;
    }

    public String getName() {
        return this.name;
    }

    public  int getAnalfabetos() {
        return this.cantidad;
    }

    public String toString() {
        return this.getName() + " ( " + getAnalfabetos() + " )";
    }

    public int compareTo(Human human) {
        if (this.cantidad == human.getAnalfabetos()) {
            return 0;
        } else if (this.cantidad > human.getAnalfabetos()) {
            return 1;
        } else {
            return -1;
        }
    }
}
