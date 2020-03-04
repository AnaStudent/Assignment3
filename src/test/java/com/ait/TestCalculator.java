package com.ait;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCalculator extends Calculator{
    Scanner input = new Scanner(System.in);
    int num1, num2;
    int ans;

    public static void main(String[] args) {
        TestCalculator testCal = new TestCalculator();
        //Encapsulation
        testCal.studInfoEncapsulation();
        //Inheritance
        testCal.addInherit();
        testCal.subtractInherit();
        testCal.multiplyInherit();
        //Polymorphism
        Calculator calPoly = new TestCalculator();
        calPoly.goals();
        calPoly = new Calculator();
        calPoly.goals();
    }
    public void studInfoEncapsulation(){
        Calculator cal = new Calculator();
        cal.setStudentId(66445);
        cal.setName("Anastasia");
        cal.setInstitution("CPUT");

        System.out.println("Student Information");
        System.out.println("Student ID: " + cal.getStudentId() + " Student name: " + cal.getName() + " Institute: " + cal.getInstitution());
    }

    public void addInherit(){
        TestCalculator testCal = new TestCalculator();
        System.out.println("===Addition===");
        System.out.println("Enter number 1:");
        num1 = input.nextInt();
        System.out.println("Enter number 2:");
        num2 = input.nextInt();
        System.out.println("The sum is: " + testCal.addition(num1,num2));
    }

    public void subtractInherit(){
        TestCalculator testCal = new TestCalculator();
        System.out.println("===Subtraction===");
        System.out.println("Enter number 1:");
        num1 = input.nextInt();
        System.out.println("Enter number 2");
        num2 = input.nextInt();
        System.out.println("The answer is: " + testCal.subtraction(num1,num2));
    }

    public void multiplyInherit(){
        TestCalculator testCal = new TestCalculator();
        System.out.println("===Multiplication===");
        System.out.println("Enter number 1:");
        num1 = input.nextInt();
        System.out.println("Enter number 2");
        num2 = input.nextInt();
        System.out.println("The answer is: " + testCal.multiplication(num1,num2));
    }
    //Polymorphism
    public void goals(){
        System.out.println("Anastasia will pass ADP with a/an: ");
    }

    @Test
    public void testStudInfoEncapsulation(){
        Calculator cal = new Calculator();
        cal.setStudentId(66445);
        cal.setName("Anastasia");
        cal.setInstitution("CPUT");

        System.out.println("Student ID: " + cal.getStudentId() + " Student name: " + cal.getName() + " Institute: " + cal.getInstitution());

        assertEquals("66445 Anastasia CPUT", cal.getStudentId()+ " " + cal.getName() + " " + cal.getInstitution());
    }
    @Test
    public void testAdditionInherit(){

    }

    @Test
    public void testPoly(){
        Calculator calPoly = new TestCalculator();
        calPoly.goals();
        calPoly = new Calculator();
        calPoly.goals();

       // assertEquals("DISTINCTION!!!!!!", calPoly.goals());
    }

}
