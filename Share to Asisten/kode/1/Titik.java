/**
 * Titik.java 23/09/11
 * Penulis : Tim Pbo
 * Deskripsi : kelas Titik
 * 
 */ 
 
 class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	//tugas dalam post test nomor 1.
	Titik(double a,double o){
		counterTitik++; // Tugas Post Test Nomor 2.
		//menambahkan counter pada bagian konstruktor, sehingga setiap objek tercipta maka counter akan bertambah.
		absis = a;
		ordinat = o;
	}
	//end tugas
	Titik(){
		counterTitik++; // Tugas Post Test Nomor 2. 
		//menambahkan counter pada bagian konstruktor, sehingga setiap objek tercipta maka counter akan bertambah.
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