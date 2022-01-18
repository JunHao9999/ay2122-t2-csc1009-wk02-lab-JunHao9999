import java.util.*;

public class MainQ1 {
    public static void main(String[] args) {
        final double pi= 3.14159;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius=sc.nextDouble();
        double area=radius*radius*pi;
        System.out.println("The area for the circle of radius " +radius+ " is " +area);


    }

}
