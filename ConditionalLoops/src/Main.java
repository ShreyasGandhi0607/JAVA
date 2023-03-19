public class Main {
    public static void main(String[] args) {
        /* syntax of if statements
       if(boolen expression T or F  ){
       // body
        }
        else{
        //do this
        }
      */

        int Salary = 25000;
        if(Salary>10000){
            Salary = Salary + 10000;
        }
        else if(Salary>20000){
            Salary = Salary +5000;
        }
        else{
            Salary+=2000;
        }
        System.out.println(Salary);
    }
}