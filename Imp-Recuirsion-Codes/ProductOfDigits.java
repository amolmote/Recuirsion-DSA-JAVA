package recuision;

public class ProductOfDigits {


    public static int productOfDigits(int n){
        if (n%10==n){
            return n;
        }
//        if (n==1){
//            return n;
//        }
        return (n%10)*productOfDigits(n/10);
    }
    public static void main(String[] args) {
        int product=productOfDigits(1234);
        System.out.println(product);
    }
}
