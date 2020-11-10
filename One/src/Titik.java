public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik;

    public Titik (double absis, double ordinat) {
        counterTitik++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik () {
        counterTitik++;
        this.absis = 0;
        this.ordinat = 0;
    }

    // Set
    public void setAbsis (double absis) {
        this.absis = absis;
    }
    public void setOrdinat (double ordinat) {
        this.ordinat = ordinat;
    }

    // Get
    public double getAbsis () {
        return this.absis;
    }
    public double getOrdinat () {
        return this.ordinat;
    }
    public int getCounter () {
        return counterTitik;
    }
}