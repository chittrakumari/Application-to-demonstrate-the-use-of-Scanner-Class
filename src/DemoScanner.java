/*
Application to demonstrate use of Scanner Class
Create an Application to accept name, age,
4-digit code, cpi, mobile no, passed and display these values
to user in the given format
Name : Chittra Kumari
Age : 19
4-digit Code : 1122
cpi : 8.8
Mobile No : 9434053111
Passed : true
 */
import java.util.Scanner;
public class DemoScanner
{
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = object.nextLine();
        System.out.println("Enter your age");
        byte age = object.nextByte();
        System.out.println("Enter your four digit secret code");
        short code = object.nextShort();
        System.out.println("Enter your mobile number");
        long mobileNumber = object.nextLong();
        System.out.println("Enter your cpi");
        double cpi = object.nextDouble();
        System.out.println("Enter your exam status as passed or failed in terms of true or false:");
        boolean passed = object.nextBoolean();
        object.close();
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("4 Digit code :" + code);
        System.out.println("CPI :" + cpi);
        System.out.println("MobileNumber :" + mobileNumber);
        System.out.println("passed :" + passed);
    }
}
