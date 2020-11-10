package com.oracle.jp2;
import java.util.*;

public class TesSet2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		System.out.println(set.add("Satu")); //apakah maksudnya? default status pada saat kita memasukkan sebuah objek
		set.add("Satu"); //apa yang terjadi? tidak dapat dilakukan duplikasi dalam set
		set.add("Dua");
		set.add(new Integer(4)); //dapatkah dilakukan? dapat, karena collection set tidak merujuk ke tipe tertentu saja
		list.add("Satu");
		list.add("Satu"); //apa yang terjadi? terjadi duplikasi
		list.add("Dua");
		//list.add(new Integer(4)); //dapatkah dilakukan? tidak dapat, karena Generic list hanya merujuk ke String saja
		map.put(new Integer(1), "satu");
		map.put(2, "dua");
		map.put(3, "tiga");
		map.put(1, "setunggal"); //apa yang terjadi? menimpa ke objek yang memiliki kunci(1)
		for (String list2:list){ //iterasi untuk mendapatkan isi dari list.
			System.out.println(list2+" ");
		}
		System.out.println(map.get(1)); //mengambil isi dengan kunci(1)
		Collection<Integer> kunci = map.keySet(); //mengambil kunci sebagai objek collection
		Collection<String> isi = map.values();//mengambil isi sebagai objek collection
		//Bagaimana iterasi mengambil kunci?
		for (Integer kunci2:kunci){
			System.out.println(kunci2+" ");
		}
		//Bagaimana iterasi mengambil isi?
		for (String isi2:isi){
			System.out.println(isi2+" ");
		}
		//Petunjuk : identik dengan list.
	}
}