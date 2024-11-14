public class Coppia<T1, T2> {
    
    T1 x;
    T2 y;

    public Coppia(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}