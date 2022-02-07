package recuision;

public class PrintingNumbers {


    public static  void printNumRev(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        printNumRev(n-1);
    }

    public static void printingNum(int n){
        if (n==0){
            return;
        }
        printingNum(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        printNumRev(6);
        System.out.println();
        printingNum(6);

    }
}
