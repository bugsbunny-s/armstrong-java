import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int tempN,n,basValue,basPow=0;
        int basNumber=0,basSum=0,result=0; 

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        n = inp.nextInt();
        
        tempN=n;

        while( tempN !=0){
            tempN = tempN / 10;
            basNumber++;
        }
        tempN = n;

       
        while( tempN !=0){
            basValue = tempN % 10;
            basPow=1;

            for(int i=1; i<= basNumber;i++){
                basPow *= basValue;
            }

            result += basPow;
            basSum+=basValue;
            tempN /=10;

            }System.out.println(result);

            if (n == result){
                System.out.println("Sayınız ARMSTRONG sayıdır.");
            }
            else{
                System.out.println("Sayınız ARMSTRONG sayı degildir.");
            }
            System.out.println("Sayınızın Basamak Toplamları : " + basSum);
        }
      }