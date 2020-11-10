public class App {
    public static void main(String[] args)  {
        // int x = -1;
        // if(x>=0) {
        //     System.out.print("x positif!");
        // } else {
        //     assert(x<0):"Ada kesalahan";
        //     System.out.print("x negatif!");
        // }
        Integer[] arrInt = new Integer[4];
        try {
            arrInt[2] = 11;
            arrInt[4] = 10;
        } catch(ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Clean up code..");
        }
    }
}
