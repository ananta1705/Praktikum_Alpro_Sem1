

public class jumat {
    public static void main(String[] args) {
        int [] lat1={10,9,8,7,6,5,4,3}; 
        int ruang=lat1.length; //mencetak panjang array


        System.out.println("panjang lat1: "+ruang); // mencetak panjang arrya
        System.out.println(lat1[1]); 

        for(int i=0;i<ruang;i++){ // 
            System.out.println(lat1[i]); // mencetak isi array
        }
    }
}
