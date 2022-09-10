import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("KDV'siz Fiyat: ");

        Double fiyat= inp.nextDouble();
        Double kdv=fiyat*18/100;

        System.out.println("KDV'li Fiyat: "+(kdv+fiyat));
        System.out.println("KDV tutarı: "+kdv);


    }
}
