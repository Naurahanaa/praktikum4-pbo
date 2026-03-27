public class KaliBagi {

    private double a1;
    private double a2;

    public KaliBagi(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double kali() {
        return a1 * a2;
    }

    public double bagi() {
        if (a2 == 0) {
            throw new ArithmeticException("Penyebut tidak boleh nol!!");
        }
        return a1 / a2;
    }
}

