import java.util.Scanner;

/** Created by IntelliJ IDEA. @Author: Yuan Jiangtao @Created: 2025/11/13 11:50 */
public class BmiCalculator {
    public static void main(String[] args){
        double height, weight, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        height = scan.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        weight = scan.nextDouble();
        bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}
