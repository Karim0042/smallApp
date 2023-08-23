package az.iktlab.service.impl;

import az.iktlab.service.inter.DBService;
import az.iktlab.service.inter.RUServiceInter;

import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RUService implements RUServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String username = sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        System.out.println("enter person_id");
        int id = sc.nextInt();
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select *from user_account");
            while (rs.next()) {
                if (username.equals(rs.getString("username"))) {
                    System.out.println("username tekrarlanir bunu deyisin!!");
                    String s = sc.nextLine();
                    username = s;

                }
            }
            String command = String.format("INSERT INTO public.user_account(username,password,person_id) values('%s','%s','%d')"
                    , username
                    , password
                    , id);
            stmt.execute(command);
            stmt.close();
            sc.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
