import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int a=sc.nextInt();
        int c;
        int d=b/2;
        if(b/2>=a){
                c=2*a;
                System.out.println(c);
                return;
                
        }
        else{
            c=2*(a-d)-1;
            System.out.println(c);
            return;
        }
        

    }
}