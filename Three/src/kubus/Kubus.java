package kubus;

import persegi.*;
import java.lang.Math;

public class Kubus {
    private Persegi permukaan;

    public Kubus(Persegi permukaan) {
        this.permukaan = permukaan;
    }

    public double hitungVolume() {
        return Math.pow(permukaan.getPanjangSisi(), 3);
    }

    public double hitungLuasAlas() {
        return Math.pow(permukaan.getPanjangSisi(), 2);
    }
}
