public class Ternary {
  public static void main(String[] args) {
      int a=10;
      int b=0;
    /**  if( a<=20)
      b=5;       
      else 
      b=8;
      */
      b=a<=20?4:9;   // ternary statement  by using ?
      System.out.println(b);
  }
}