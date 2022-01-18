import java.util.*;

public class MainQ4 {
    public static void main(String[] args) {
        String []zodic={"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        int mod=year%12;
        System.out.println(zodic[mod]);

    }
}
