package recuision;

public class SumOfNnatual {


    public  static int sumOfNatural(int n){
        if (n<=1){
            return 1;
        }
        return n+sumOfNatural(n-1);
    }
    public static void main(String[] args) {
        int ans=sumOfNatural(4);
        System.out.println(ans);
    }
}
