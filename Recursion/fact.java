public class fact {
    public static void main(String[] args) {
        //this is using head recursion-> jab wapis aate hue mtlb stack shrink hote hue ans bane tab head recursion hoti hai
        int n=5;
        System.out.println(fac(n));
    }
    public static int fac(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fn=fac(n-1);
        return fn*n;
    }
    
}
