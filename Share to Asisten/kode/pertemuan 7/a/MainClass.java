package com.oracle.training;

public class MainClass {

	public static void main(String[] args) {
		
		Pegawai p = new Programmer();
		p.nama = "Paiman";
		p.tampilData();
		Pegawai m = new Manajer();
		m.nama = "Alex";
		m.tampilData();
			if (p instanceof Programmer){
			Programmer prog = (Programmer)p;
			int gatot = prog.bonus + prog.gapok;
			System.out.println("Gaji Total Programmer = "+gatot);
			}
			else if (p instanceof Manajer){
				Manajer man = (Manajer)p;
				int gatot = man.tunjangan + man.gapok;
				System.out.println("Gaji Total Manajer = "+gatot);
			} 
				
	}

}
