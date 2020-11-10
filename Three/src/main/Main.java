package main;

import kubus.*;
import persegi.*;

public class Main {
    public static void main(String[] args) {
        Persegi persegiSatu = new Persegi(4);

        Kubus kubusSatu = new Kubus(persegiSatu);

        System.out.println("Volume: "+kubusSatu.hitungVolume());
        System.out.println("Luas Alas: "+kubusSatu.hitungLuasAlas());
    }
}
