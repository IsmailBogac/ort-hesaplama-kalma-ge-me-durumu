import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur

        int mat, turkce, fizik , kimya , tarih ,muzik ;

        // Scanner sınıfımızı tanımladık

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al

        System.out.print("Matematik notunuzu giriniz:");
        mat=inp.nextInt();


        System.out.print("Türkçe notunuzu giriniz:");
        turkce=inp.nextInt();


        System.out.print("Fizik notunuzu giriniz:");
        fizik=inp.nextInt();


        System.out.print("Kimya notunuzu giriniz:");
        kimya=inp.nextInt();


        System.out.print("Tarih notunuzu giriniz:");
        tarih=inp.nextInt();


        System.out.print("Müzik notunuzu giriniz:");
        muzik=inp.nextInt();


        int toplam = (mat+turkce+fizik+kimya+tarih+muzik);

        double ortalama = toplam/6.0;

        System.out.println("Ortalamınız:"+ortalama);

        boolean durum = ortalama >= 60 ;
        boolean durum2 = ortalama <= 60;
        boolean sonuc = durum && durum2 ;

        String str = durum ? "Sınıfı geçti " : "Sınıfta Kaldı" ;

        System.out.println(str);




    }
}