public class EqSolution {
    private final int a;
    private final int b;
    private final int c;

    public EqSolution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int[] value() {
        int d = new Diakrinousa(a, b, c).value();
        int r1 = new PositiveSolution(d, a, b).riza();
        if (d == 0) {
            return new int[]{r1};
        } else if (d > 0) {
            int r2 = new NegativeSolution(d, a, b).riza();
            return new int[]{r1, r2};
        } else {
            return new int[]{};
        }
    }
}
