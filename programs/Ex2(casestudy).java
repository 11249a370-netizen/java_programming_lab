//Student.java
package com.pavan.fee.model;

public class Student {
    public String name;
    public String course;

    public Student(String n, String c) {
        name = n;
        course = c;
    }
}
//File2:FeeRule.java
package com.pavan.fee.service;

public class FeeRule {
    public static double fee(String course){
        if(course.equals("BE"))
            return 75000;
        if (course.equals("ME"))
            return 60000;
        return 40000;
    }
    
}
//File3:FeeApp.java
import com.pavan.fee.model.Student;
import com.pavan.fee.service.FeeRule;
public class FeeApp {
    public static void main(String[] args){
        Student[] s={
            new Student("Meenakshi","BE"),
            new Student("sundaresan","ME"),
            new Student("sivaraman","BSc") };
            double total =0;
            for (Student x : s){
                double f=FeeRule.fee(x.course);
                System.out.printf("%-8s %-5s %10.2f%n",x.name,x.course,f);
                total=total+f;
            }
            System.out.printf("Total fee =%.2f%n",total);
        }  
    }
