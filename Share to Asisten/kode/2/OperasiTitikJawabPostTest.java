/**
 * OperasiTitik.java 2015
 * Penulis : Panji Wisnu Wirawan
 * Deskripsi : jawaban post test, redesigning class
 * 
 */ 
 
public class OperasiTitikJawabPostTest{
	//begin tugas
	//buat refleksiSumbuX dan refleksiSumbuY private
	private void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);	
	}
	private void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	//buat method baru,refleksiX dan refleksiY public method, dengan memanfaatkan refleksiSumbuX dan refleksiSumbuY
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}	
	//end tugas
	
	//untuk test data saja
	public static void main(String args[]){
		Titik titikAwal = new Titik(10,10);
		OperasiTitikJawabPostTest operasi = new OperasiTitikJawabPostTest();
		
		Titik titikHasilRefleksiX = operasi.refleksiX(titikAwal);
		System.out.println(titikHasilRefleksiX.getAbsis());
		System.out.println(titikHasilRefleksiX.getOrdinat());	
		
		Titik titikHasilRefleksiY = operasi.refleksiY(titikAwal);	
		System.out.println(titikHasilRefleksiY.getAbsis());
		System.out.println(titikHasilRefleksiY.getOrdinat());	//hasilnya sama, karena nilai atribut titik awal telah berubah
	}
}