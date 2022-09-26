/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите имя пользователя: "); 
        String yourname = scanner.nextLine();
        System.out.print("Введите фамилию: "); 
        String yoursurname = scanner.nextLine();
        System.out.print("Введите ваш личный код: "); 
        String id = scanner.nextLine();
        System.out.print(yourname);
        System.out.print(yoursurname);
        String year = id.substring(1,3);
        String cent = id.substring(0);
        if (cent.contains("4") || cent.contains("3")) {
            System.out.print(" Год: 19" + year);
    }
        if (cent.contains("5") || cent.contains("6")) {
            System.out.print(year+ "года");
        }
        String month = id.substring(4,5);
        System.out.print(" Месяц: "+month);
        String day = id.substring(5,7);
        System.out.println(" День: "+day);
        // TODO code application logic here
    }
    
}
