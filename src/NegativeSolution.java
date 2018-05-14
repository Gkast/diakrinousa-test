public class NegativeSolution {
    private final int d;
    private final int a;
    private final int b;

    public NegativeSolution(int d, int a, int b) {
        this.d = d;
        this.a = a;
        this.b = b;
    }

    public int riza() {
        return (int) (-b - Math.sqrt(d)) / 2 * a;
    }
}
