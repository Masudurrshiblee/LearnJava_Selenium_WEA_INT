package method;

public class LearnMethod {
    // return Type method without parameter:

    public int doSummation(){
        int number1=24;
        int number2=20;
        int sum=number1+number2;
        System.out.println("value of Sum is "+sum);
        return sum;  // In Return type method you must have to make return code last line of method
    }
    // return Type method with parameter: Dynamic
    public int doSubtraction(int num1, int num2){
        int number1=num1;
        int number2= num2;
        int sub = number2 - number1;
        System.out.println("Subtraction value will be "+sub);
        return sub;  // In Return type method you must have to make return code last line of method
    }

    public String stInfo(String fName, String lName, int age){
        String fullName=fName+" "+lName;
        System.out.println("Full Name is "+fullName+" and age is "+age);
        return fullName;

    }
    public static void main(String[] args){
        LearnMethod obj= new LearnMethod();
        obj.doSummation();
        obj.doSubtraction(100,50);
        obj.doSubtraction(200,50);
        obj.stInfo("james","willium",29);


    }
}
