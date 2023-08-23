package az.iktlab.service.impl;

import az.iktlab.entity.Person;
import az.iktlab.service.inter.SHPServiceInter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SHPService implements SHPServiceInter {
    @Override
    public void process() {
        List<Person> list = new ArrayList<>();

        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.execute("select *from person");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                int id = Integer.valueOf(rs.getInt("id"));
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String father_name = rs.getString("father_name");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                Person pr = new Person(id, name, surname, father_name, age, gender);
                list.add(pr);
            }
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list);
    }
}
