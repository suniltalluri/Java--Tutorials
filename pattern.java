public class pattern {
    public static void main(String[] args) {
        int n=10;
        for(int a=1;a<=n;a++)
        {
             for(int b =1;b<=n-a;b++)
            {
            System.out.print(" ");
            }
            for(int c=1;c<=2*a-1;c++)
            {
                System.out.print("*");
            }
            
        System.out.println( );
       }
    }
            
}
