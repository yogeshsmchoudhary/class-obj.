public class Q5 {
    public static void main(String[] args){
        Contact c1=new Contact();
        c1.setId(101);
        c1.setfirstName("yogesh");
        c1.setlastName("choudhary");
        c1.setmobailNo(761064379);
        c1.setemailId("yogeshsmchoudhary@gmail.com");

        System.out.println("Employee Id = "+c1.getId());
        System.out.println("Employee First Name = "+c1.getfirstName ());
        System.out.println("Employee Last Name = "+c1.getlastName ());
        System.out.println("Employee Mobailno. = "+c1.getmobailNo ());
        System.out.println("Employee E-mail Id = "+c1.getemailId ());

    }
    
}
class Contact{
    int id;
    long mobailNo;
    String firstName,lastName,emailId;
    public void setId(int i){id=i;}
    public void setfirstName(String n){firstName=n;}
    public void setlastName(String l){lastName=l;}
    public void setmobailNo(long m){mobailNo=m;}
    public void setemailId(String e){emailId=e;}
  //method's
  public int getId(){return id  ;}
  public String getfirstName (){return firstName  ;}
  public String getlastName (){return lastName  ;}
  public long getmobailNo (){return  mobailNo ;}
  public String getemailId (){return emailId ;}
  

   
}