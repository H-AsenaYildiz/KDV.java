import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        // deðiþkenleri oluþtur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sýnýfý tanýmlandý
        Scanner inp = new Scanner(System.in);

        //Kullanýcýdan deðerleri al
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        //System.out.println(mat);

        System.out.print("Fizik notunuzu giriniz: : ");
        fizik =inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=inp.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=inp.nextInt();

        double a;
        a= (mat+muzik+kimya+fizik+tarih+turkce)/6.0;

        System.out.println("Ortalamanýz: " +a);

        Boolean sonuc=a>=60;
        String str=(sonuc)? "Geçti":"Kaldý";
        System.out.println(str);


    }

}
