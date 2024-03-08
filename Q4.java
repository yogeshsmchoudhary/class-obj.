public class Q4 {
    
    public static void main(String[] args){
        Employee e1=new Employee(); 
        e1.setEmpId(101);
        e1.setName( "yogesh choudhary");
        e1.setSalary(1000);

        System.out.println("EmployeeId = "+ e1.getEmpId());
        System.out.println("Employee Name = "+e1.getname());
        System.out.println("Employee salary = "+e1.getsalary());
    }
}
class Employee{
    int empId,salary;
    String name;
//function's
    public void setEmpId(int i){empId=i;}
    public void setName(String n){name=n;}
    public void setSalary(int s){salary=s;}
//method's
    public int getEmpId(){return empId;}
    public String getname(){return name;}
    public int getsalary(){return salary;}
}












public void setfirstname(String n){firstName=n;}
public void setlastname(String l){lastName=l;}
public void setmobailNo(String e){emailId=e;}
public void setmobailNo(int m){mobailNo=m;}