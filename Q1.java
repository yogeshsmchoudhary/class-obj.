public class Q1 {
    public static void main(String[] args){

   complex c1=new complex();

     c1.setcomplex(100,200);
     c1.showcomplex();
    } 
}
class complex{
    // instance member veriable
   private int real , ima ;

   // instance member funtion 01
   public void setcomplex(int r,int i){
    real=r;
    ima=i;
   }
  // instance member function 02
  public void showcomplex(){
    System.out.println("complex number is ="+real+"+"+ima+"i");
  }

  
   }




