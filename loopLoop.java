public class loopLoop {
    public static void main(String[] args) {
        int numbers[]={12,-1,-5,12};
        int sum=0;
        double average;
        for( int number :numbers)
        {
            sum+=number;
        }
        int arraylength=numbers.length;
        average=((double)sum /(double)arraylength);
        System.out.println("sum :"+sum);
        System.out.println("average :"+average);
        
        
    }
}
