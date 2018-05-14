public class Diakrinousa {
    private int a;
    private int b;
    private int c;

    public Diakrinousa(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int value() {
        return (int) Math.pow(b, 2) - 4 * a * c;
    }
}
