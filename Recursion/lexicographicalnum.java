public class lexicographicalnum {
    public static void main(String[] args) {
        int n=1000;
        int current=0;
        lexico(n,current);
    }
    public static void lexico(int n, int curr)
    {
        if(curr>n) return;
        System.out.println(curr);
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            lexico(n,curr*10+i);
        }
    }
    
}
