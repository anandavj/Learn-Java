public class MTitik {
    public static void main (String[] args) {
        Titik satu = new Titik();
        satu.setAbsis(1);
        satu.setOrdinat(2);

        Titik dua = new Titik();
        dua.setAbsis(3);
        dua.setOrdinat(1);

        System.out.println("tiga\nx:"+dua.getAbsis()+"\ny:"+dua.getOrdinat());
    }
}