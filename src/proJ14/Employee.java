package proJ14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

 class Employee {

    int Reg_No,Rt1,Rt2,Rt3;
    String Name;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void GetInput() throws Exception{
        System.out.println("Please enter Employee  detail: Reg_No,Name, Skill levels of Java, Python,PHP");
        Reg_No = Integer.parseInt(br.readLine());
        Name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());
    }
    void display(){
        System.out.println("Your Reg_NO");
        System.out.println("Your Name is: "+ Name);
        System.out.println("Your Java Skill is:"+Rt1);
        System.out.println("Your Python Skill is"+Rt2);
        System.out.println("Your PHP Skill is:"+ Rt3);
    }
}
class Output extends Employee{
    int Total;
    float Avarage;

    void evaluate() throws Exception{
        GetInput();
        Total = Rt1+Rt2+Rt3;
        Avarage = (float)Total/3;
    }
    void screenshow(){
        System.out.println("Overall Rating is : "+Total);
        System.out.println("Your percentage is: "+Avarage);
    }
}

class Company{
    public static void main(String args[]) throws Exception{
        Output ot = new Output();
        ot.evaluate();
        ot.screenshow();
    }
}