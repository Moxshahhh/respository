// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int a=0;
        int n=0;
        int p=0;
        int q=3;
        while(a<100){
            n+=a;
            a+=2;
        }
        while(q<100){
            p+=q;
            q+=2;
        }
        System.out.println(n-p);
    }
}