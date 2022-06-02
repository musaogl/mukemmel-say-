import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n,total=0;
        System.out.print("sayı giriniz :");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(int i=1;i<=n;i++) {
            if (n % i== 0) {
                total += i;
            }
        }
            if(total==(n*2))
                System.out.println("Mükemmel bir sayıdır .");
            else
                System.out.println("Mükemmel bir sayı değildir . ");
        }
    }

