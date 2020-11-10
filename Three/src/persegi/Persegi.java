package persegi;

import poligon.Poligon;

public class Persegi extends Poligon{
    
    private double panjangSisi;

    public Persegi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public double hitungLuas() {
        return this.panjangSisi*this.panjangSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }

}
