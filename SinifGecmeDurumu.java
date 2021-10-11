package Pratik8;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fzk,trkce,kmy,mzk,ortalama,derssayisi=5;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        mat=input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
            derssayisi --;
        }

        System.out.print("Fizik Notunuzu Giriniz:");
        fzk=input.nextInt();
        if (fzk<0||fzk>100){
            fzk=0;
            derssayisi --;
        }

        System.out.print("Türkçe Notunuzu Giriniz:");
        trkce=input.nextInt();
        if (trkce<0||trkce>100){
            trkce=0;
            derssayisi--;}

        System.out.print("Kimya Notunuzu Giriniz:");
        kmy=input.nextInt();
            if (kmy<0||kmy>100) {
                kmy = 0;
                derssayisi--;
            }
        System.out.print("Müzik Notunuzu Giriniz:");
        mzk=input.nextInt();
                if (mzk<0||mzk>100) {
                    mzk = 0;
                    derssayisi--;
                }
        ortalama = (mat+fzk+trkce+kmy+mzk) / derssayisi;

                if (ortalama>=55){
                    System.out.println("Tebrikler Sınıfı Geçtiniz");
                }
                else {
                    System.out.println("Sınıfta Kaldınız.");

                }
        System.out.print("Ortalamanız:"+ortalama);
    }
}
