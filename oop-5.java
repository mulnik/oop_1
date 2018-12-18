Main.java
 
public class Recursion {
    public static void recursion(long n){
        if(n==0){
            System.out.println(" ");
            }
            else{
                System.out.print(n%10 + " ");
                n=n/10;
                recursion(n);
                }
                }
                public static void main(String[] args) {
                    long N = 232323254;
                    recursion(N);
                    }
                    }