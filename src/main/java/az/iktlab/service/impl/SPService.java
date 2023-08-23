package az.iktlab.service.impl;

import az.iktlab.entity.Person;
import az.iktlab.enums.Gender;
import az.iktlab.service.inter.SPServiceInter;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SPService implements SPServiceInter {
    @Override
    public void process() {
        Person pr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter surname");
        String surname = sc.nextLine();
        System.out.println("enter surname");
        String fatherName = sc.nextLine();
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("enter gender(1.male,2.female)");
        int sel = sc.nextInt();
        if (sel == 1) {
            pr = new Person(name, surname, fatherName, age, Gender.MALE.getGender());
        } else {

            pr = new Person(name, surname, fatherName, age, Gender.FEMALE.getGender());
        }

        String command = String.format("INSERT INTO public.person(name,surname,father_name,age,gender) values('%s','%s','%s','%d','%s')",
                pr.getName()
                , pr.getSurname()
                , pr.getFatherName()
                , pr.getAge()
                , pr.getGender());
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.execute(command);
            stmt.close();
            sc.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}