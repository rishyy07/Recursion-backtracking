public class boardsum {
    public static void main(String[] args) {
        String ans="";
        int n=3;
        int curr=0;
        printans(n,curr,ans);
        
    }
    public static void printans(int n,int curr, String ans)
    {
        if(curr==n)
        {
            System.out.println(ans+" ");
            return;
        }
        if(curr>n) return;
        printans(n,curr+1,ans+1);
        printans(n,curr+2,ans+2);
        printans(n,curr+2,ans+3);
    }
    
}
