import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenlerimizi tanımlayalım
        int a,b;
        double c;

        Scanner inp=new Scanner(System.in);
        //üçgenin 2 kenarını kullanıcıdan alıyoruz
        System.out.print("Lutfen üçgenin 1. kenarını giriniz :");
        a=inp.nextInt();
        System.out.print("Lutfen üçgenin 2. kenarını giriniz :");
        b=inp.nextInt();

        //math sınıfı sayesinde hipotenüsü bulmuş olduk ve sqrt ile karekök almış olduk
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs :" + c);

        






    }
}
