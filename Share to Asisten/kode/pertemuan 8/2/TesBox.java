package com.oracle.pbo2;

import java.util.*;
public class TesBox {

	public static void main(String[] args) {
		ArrayList<BangunDatar> lbox = new ArrayList<BangunDatar>();
		BangunDatar bd = new BangunDatar();
		BangunDatar kk1 = new Kotak(4);
		BangunDatar kk2 = new Kotak(3,4);
		BangunDatar lk = new Lingkaran(10);
		lbox.add(bd);
		lbox.add(kk1);
		lbox.add(kk2);
		lbox.add(kk2);
		lbox.add(lk);
		lbox.add(new Persegi(1));
		lbox.add(new Persegi(2));
		System.out.println(lbox.size());
		System.out.println(lbox);
		//Bagaimanakah iterasi menghitung seluruh luas Generic BangunDatar?
		for(BangunDatar lbox2:lbox){
			System.out.println(lbox2.luas());
		}
	}
}
