public class pal {
    public static void main(String[] args) {
        int n=202;
        int r=0;
        int sum=0;
        int tmp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
    if(tmp==sum)
    {
         System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
    }
    
}
