public class copyarray {
    public static void main(String[] args) {
        int []a={11,22,33,44,55,66};
        int []b=new int[a.length];
       // a[0]=-11;/ for changing index values;
        System.arraycopy(a,3,b,3,3); 
        for(int i=0;i<a.length;i++){
         System.out.println(a[i]+"..... "+b[i]);   
        
        }  
    }
}
