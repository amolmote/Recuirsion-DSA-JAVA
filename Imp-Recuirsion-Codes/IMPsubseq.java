package recuision;

public class IMPsubseq {


    public static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);           //p means processed string and up means unprocesses add one igone one
        subseq(p+ch,up.substring(1));//take one
        subseq(p, up.substring(1));//ignore one



    }
    public static void main(String[] args) {
        subseq("","abc");
    }
}
