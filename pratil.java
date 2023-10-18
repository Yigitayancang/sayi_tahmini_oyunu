import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class pratil {

    public static void main(String[] args) { 
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner inp = new Scanner(System.in);
        int right = 0;
        int select;
        int [] raf = new int[5]; 
        boolean iswin = false;
        System.out.println(number);   

        while (right < 5){
            
            System.out.print("LÜTFEN SAYI TAHMİNİ GİRİNİZ : ");
            select = inp.nextInt();

            if( select < 0 || select > 99){
                System.out.println("Lütfen 0 - 100 arasında bir değer giriniz ");
            }

            if(select == number){
                System.out.println("TEBRİKLER SAYİ TAHİNİ GERÇEKLEŞTİ : ");
                iswin = true;   
                break;
            }
            else{
                raf[right]= select;
                right++;
                System.out.println("Hatalı bir sayı girdiniz : ");
                if(select >number){
                    System.out.println(select + "seçilen sayı gizli sayıdan büyüktür.");
                }
                else{
                    System.out.println(select + "seçilen sayıdan küçüktür.");
                }
               
               System.out.println("kalan hak: " + (5-right));
            }
        }
          if(!iswin){
                System.out.println("oyunu kaybettiniz..");
                System.out.println("Tahminleriniz : " + Arrays.toString(raf));
            }
    }
    
}