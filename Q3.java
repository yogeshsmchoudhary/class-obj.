public class Q3 {
    public static void main(String[] args ){

        cuboid c1=new cuboid();

            c1.setlength(10);
            c1.setbreadth(20);
            c1.setheight(30);

            System.out.println("length = "+c1.length);
            System.out.println("breath = "+c1.breath);
            System.out.println("height = "+c1.height);

            System.out.println("volume = "+c1.getvolume());
    }
    
}
class cuboid{


// instance variable.
    public int length,breath,height;
// instance mathodes.input lene k liye.

    public void  setlength(int l){length=l;}
    public void  setbreadth(int b){breath=b;}
    public void  setheight(int h){height=h;}

//inftance methods output dene k liye.
    public int getvolume(){return length*breath*height;}


}
