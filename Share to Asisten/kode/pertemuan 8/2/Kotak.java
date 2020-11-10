package com.oracle.pbo2;

public class Kotak extends BangunDatar{
	double sisi;
	double sisi2;
	Kotak(double s){
		sisi = s;
		sisi2 = s;
	}
	Kotak(double p, double l){
		sisi = p;
		sisi2 = l;
	}
	public double luas(){
		return sisi*sisi2;
	}

}
