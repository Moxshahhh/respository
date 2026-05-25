import java.util.Scanner;    
public class topa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int max=0;
        int d=0;
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            d=d-b+c;
            if(d>max){
                max=d;
            }
        }
        System.out.println(max);
    }
}
