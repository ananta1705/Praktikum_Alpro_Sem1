public class arraydouble {
    /**
    //  * @param args
     */
    public static void main(String[] args) {
        // Membuat array bertipe double dengan 6 slot
        double[] arrayDouble = new double[6];

        double ruang= arrayDouble.length;
        double ww =7.0;
        boolean zz =true;
        System.out.println("panjang arrayDouble+ruang");
        // Mengisi array dengan beberapa nilai (opsional)
        arrayDouble[0] = 1.1;
        arrayDouble[1] = 2.2;
        arrayDouble[2] = 3.3;
        arrayDouble[3] = 4.4;
        arrayDouble[4] = 5.5;
        arrayDouble[5] = 6.6;

        // Menampilkan isi array
        for (int i=0;i<=ruang; i++){
            
            System.out.println(i +1+ ". " + arrayDouble[i] +"-> slot ke-" + i);
            arrayDouble[4] = 7;
            if(arrayDouble[4] == ww){
                System.out.println(zz);
            }else{
                System.out.println("false");
            }
         
        }
    }
}
