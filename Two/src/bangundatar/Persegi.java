package bangundatar;
import poligon.Poligon;

public class Persegi extends Poligon{
    private double panjang, lebar;

    public Persegi(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return this.panjang*this.lebar;
    }

    public void printInfo() {
        System.out.println("Sisi:"+this.getJumlahSisi());
    }
}
