import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        int select;

        Scanner scan=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        a=scan.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        b=scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi giriniz:");
        select=scan.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama = "+(a+b));
                break;
            case 2:
                System.out.println("Çıkarma= "+(a-b));
                break;
            case 3:
                System.out.println("Çarpma= "+(a*b));
                break;
            case 4:
                if (b!=0){
                System.out.println("Bölme= "+(a/b));
                }else
                    System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }
    }
}