package com.oracle.pbo2;

public class Lingkaran extends BangunDatar{
	double jari;
	static double phi=3.14;
	Lingkaran(double r){
		jari=r;
	}
	public double luas(){
		return phi*jari*jari;
	}
}
