package az.iktlab.util;

import az.iktlab.enums.Menu;

import java.util.Scanner;

public class MenuUtil {
    public void showMenu() {
        System.out.println("1.Save Person\n" +
                "2.Register User\n" +
                "3.Show People\n" +
                "4.EXIT");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one:");
        int num = sc.nextInt();
        selectMenu(num);

    }

    public void selectMenu(int number) {
        for (Menu menu: Menu.values()) {
            if(number == menu.getIndex()){
                menu.doProcess();
            }
            if (number == 4)
                System.exit(0);
        }
    }
}
