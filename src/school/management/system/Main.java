package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher jeevani = new Teacher(1,"Jeevani", 500);
        Teacher ajantha = new Teacher(2, "Ajantha", 750);
        Teacher hewagamage = new Teacher(3, "Hewagamage", 1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(jeevani);
        teacherList.add(ajantha);
        teacherList.add(hewagamage);

        Student hadhi = new Student(1, "Hadhi", 4);
        Student pramuditha = new Student(2, "Pramuditha", 3);
        Student himansa = new Student(3, "Himansa",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(hadhi);
        studentList.add(pramuditha);
        studentList.add(himansa);

        School ucsc = new School(teacherList, studentList);

        hadhi.payFees(5000);
        pramuditha.payFees(7500);
        System.out.println("UCSC has earned: Rs. " + ucsc.getTotalMoneyEarned());

        System.out.println("SALARY PAYMENTS");
        jeevani.receiveSalary(jeevani.getSalary());
        System.out.println("UCSC has spent salary of " + jeevani.getSalary() + " to Dr." + jeevani.getName() + " and now has " + ucsc.getTotalMoneyEarned());
    }
}
