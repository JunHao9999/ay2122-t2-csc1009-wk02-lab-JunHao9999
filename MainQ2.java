import java.util.*;

public class MainQ2 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers:");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println("The average of "+a+" "
        +b+" "+c+" is "+avg);



    }
}
