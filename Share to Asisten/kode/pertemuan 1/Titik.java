/**
 * Titik.java 23/09/11
 * Penulis : Panji Wisnu Wirawan
 * Deskripsi : kelas Titik
 * 
 */ 
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	//tugas dalam post test 
	Titik(double a,double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	//end tugas
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
		
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}

 }