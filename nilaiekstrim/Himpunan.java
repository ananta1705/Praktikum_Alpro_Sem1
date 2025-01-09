package nilaiekstrim;
public class Himpunan {
    public static boolean isValid(int[] himpunan) {
        boolean[] cek = new boolean[101]; // Asumsi angka maksimal 100
        for (int angka : himpunan) {
            if (angka >= 0 && angka <= 100 && cek[angka]) {
                return false; // Ada duplikat
            }
            cek[angka] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] himpunanA = {11, 28, 33, 64, 95, 16};
        int[] himpunanB = {11, 28, 33, 64, 95, 16, 100, 28, 33, 64, 95, 16};

        System.out.println("Himpunan A valid? " + isValid(himpunanA));
        System.out.println("Himpunan B valid? " + isValid(himpunanB));
    }
}