package com.ait;

public class Calculator {
    //Encapsulation
    private int studentId;
    private String name;
    private String institution;

    public Calculator() {
    }

    public Calculator(int studentId, String name, String institution) {
        this.studentId = studentId;
        this.name = name;
        this.institution = institution;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getInstitution() {
        return institution;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Inheritance
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int addition(int a, int b){
        int ab = a+b;
        return ab;
    }

    public int subtraction(int c, int d){
        int cd = c-d;
        return cd;
    }

    public int multiplication(int e, int f){
        int ef = e * f;
        return ef;
    }
    //Polymorphism
    public void goals(){
        System.out.println("DISTINCTION!!!!!!");
    }
}
