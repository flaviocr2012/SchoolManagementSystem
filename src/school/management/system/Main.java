package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher Felipe = new Teacher("Felipe", 123456, 2500);
        Teacher Manuela = new Teacher("Manuela", 456789, 3500);
        Teacher Paulo = new Teacher("Paulo", 159753, 4000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Felipe);
        teacherList.add(Manuela);
        teacherList.add(Paulo);

        Student Rodrigo = new Student("Rodrigo", 456123, 8);
        Student Rafael = new Student("Rafael", 456123, 7);
        Student Samantha = new Student("Samantha", 456123, 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Rodrigo);
        studentList.add(Rafael);
        studentList.add(Samantha);

        School pto = new School(teacherList, studentList);

        Rodrigo.payFees(5000);
        Rafael.payFees(10000);
        System.out.println("PTO has earned " + pto.getTotalMoneyEarned());

        System.out.println("-----------Making SCHOOL PAY SALARY-----------");
        Manuela.receiveSalary(Manuela.getSalary());
        System.out.println("PTO has spent for salary to " + Manuela.getName() + " $ " + Manuela.getSalary());

        Paulo.receiveSalary(Paulo.getSalary());
        System.out.println("PTO has spent for salary to " + Paulo.getName() + " and now It has $ " + pto.getTotalMoneyEarned());
        System.out.println(Paulo);

        System.out.println("-------------School has earned some fees from Students---------");
        Samantha.payFees(7000);
        Rodrigo.payFees(5000);
        System.out.println("PTO has earned " + pto.getTotalMoneyEarned());

        System.out.println(Rodrigo);


    }
}
