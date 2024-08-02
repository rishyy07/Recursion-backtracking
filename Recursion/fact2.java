public class fact2 {
    public static void main(String[] args) {
        //using tail recrsion
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int ans=n*fact(n-1);
        return ans;
    }
    
}
