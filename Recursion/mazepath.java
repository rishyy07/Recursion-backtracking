public class mazepath {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        printans(0,0,m-1,n-1,"");
        
    }
    public static void printans(int cr,int cc,int er,int ec,String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;

        }
        if(cr>er || cc>ec) return;
        printans(cr+1, cc, er, ec, ans+"H");
        printans(cr, cc+1, er, ec, ans+"V");
    }
    
}
