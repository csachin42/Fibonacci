package Fibonacci1;
import java.util.Scanner;

class Fibonaci {
    int input,temp=0,temp1=1,sum;
    void input(){                // Taking input from user//
        System.out.println("Enter the number");  // user will get
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
    }
    void output(){                        // Output method for calculation//
        int j=0;
        for (j=0;j<=input;++j){
            System.out.println(sum);    // Output will be displayed in terminal//
            sum=temp+temp1; // Adding initial two values
            temp=temp1;    // swaping temp1 value to temp
            temp1=sum;    // swaping sum to temp 1
        }
    }
    public static void main(String[] args) {
        Fibonaci f=new Fibonaci();
        Display d=new Display();
        f.input();
        f.output();
    }
}
