public class cointoss {
    public static void main(String[] args) {
        int n=3;
        String ans="";
        //coin1(n,ans);
        coin2(n, ans);
    }
    //coin2 printing outcomes except the ones jisme 2head ek sath aa rahe hai
    public static void coin2(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            coin2(n - 1, ans + "H");

        }
        
        coin2(n-1,ans+"T");

    }
    //coin1 printing all the possible outcomes
    public static void coin1(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;

        }
        coin1(n-1,ans+"H");
        coin1(n-1,ans+"T");
    }
    
}
