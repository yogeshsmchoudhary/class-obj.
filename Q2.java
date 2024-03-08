public class Q2 {
    public static void main(String[] args) {
        Time t1=new Time();
        t1.setvalue(3,25,56);
        t1.showvalue();

    }
}

class Time {
    // instance member veriable of class Time.
    int h, m, s;

    // instance membe function 01.
    // this key functon ki value leke instance variable mai dal deta hai 
    // to, chahe this ka use kro ya nhi loifarak nhi padata hai
    void setvalue(int x, int y, int z) {
       this.h = x;
       this.m = y;
       this.s = z;
    }
    // instance membe function 02.

    void showvalue(){
            System.out.print("Time is :-"+h+" hr \t"+m+" min \t"+s+" sec");
        }

}
