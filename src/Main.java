import java.util.Scanner;
//a simple class to represent an object with attribute and method.
public  class Main {
    class Person {
        static String name = "HermelaDemeke";
        static int age = 20;
        static class Outer {
            void mom() {
                System.out.println("your" + " " + "name is" +" "+ name + " " + "\n " + "your age is" + " " + age);
            }

            //create a java class called Main
            public static  void main(String[] args) {
                Person.Outer obj=new Person.Outer();
                obj.mom();

                Scanner input = new Scanner(System.in);
                //declare variables of different data type and arithmetic operators to perform operation on numeric variables
                int num1 = 100;
                int num2 = 50;
                double add = num1 + num2;
                double sub = num1 - num2;
                double mul = num1 * num2;
                double div = num1 / num2;
                System.out.println("the sum of two number" + " "+ num1 + "and" +  num2 + " is" + add);
                System.out.println("the subtraction of two number" + " "+ num1 + "and" +  num2 + " is" + sub);
                System.out.println("the multiplication of two number" +" " + num1 + "and" +  num2 + " is" + mul);
                System.out.println("the division of two number" + " "+ num1 + "and " +  num2 + " is" + div);
                double result=volume(30,34,56);
                System.out.println("the volume is\t"+result);
                System.out.println("enter any number 1-7 to know the days name");
                int day = input.nextInt();
                // if else and switch-case to implement decision making
                switch (day) {
                    case 1:
                        System.out.println("monday");
                        break;
                    case 2:
                        System.out.println("tuesday");
                        break;
                    case 3:
                        System.out.println("wednesday");
                        break;
                    case 4:
                        System.out.println("thursday");
                        break;
                    case 5:
                        System.out.println("friday");
                        break;
                    case 6:
                        System.out.println("saturday");
                        break;
                    case 7:
                        System.out.println("sunday");
                        break;
                    default:
                        System.out.println("wrong number");
                }

                if (num1 > num2) {
                    System.out.println("num1 is greater than num2");
                }
                else System.out.println("num2 is greater than or equal to num1");
                // for and while loop to implement repetitive tasks
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Never settle for less than your best");
                }
                int i = 0;
                while (i <= 4) {
                    System.out.println("little by little we go far");
                    i++;
                }
            }
            public static double volume(float L, float W,float H)//method with parameters and return type
            {
                return(L*W*H);
            }
        }
    }
}