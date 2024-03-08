public class Q6 {

public static void main(String[] args) {
    

    Question q1=new Question();
    //setter 
    q1.setqueno(101);
    q1.setque("What is the capital of india ?");
    q1.setOptionA("(A)Ahemdabad");
    q1.setOptionB("(B)Banglore");
    q1.setOptionC("(C)colkata");
    q1.setOptionD("(D)Delhi");
  //print veriable
    System.out.print("<"+q1.queno+"> ");
    System.out.println(q1.que);
    System.out.println(q1.OptionA);
    System.out.println(q1.OptionB);
    System.out.println(q1.OptionC);
    System.out.println(q1.OptionD);

// GETTER
    q1. getanswer('D');


    
    

}
}
class Question{
int queno;
String que ,OptionA, OptionB,OptionC,OptionD ;
char answer;

//setter method's

public void setqueno(int qN){queno=qN;}
public void setque(String a){que=a;}
public void setOptionA(String a){OptionA=a;}
public void setOptionB(String b){OptionB=b;}
public void setOptionC(String c){OptionC=c;}
public void setOptionD(String d){OptionD=d;}
public void setAnswer(char an){answer=an;}


//getter method's
public void getanswer(char ans){
    answer =ans;

switch(answer) {
    case 'A':
   System.out.println("False");
      break;
    case 'B':
    System.out.println("False");
      break;
    case 'C':
    System.out.println("False");
      break;
    case 'D':
    System.out.println("True");
      break;
    default:
      System.out.println("Enter valid Option");
  }

}
}