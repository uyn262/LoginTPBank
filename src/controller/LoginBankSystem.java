/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Locale;
import repository.LoginBankRepository;
import view.Menu;

/**
 *
 * @author Admin
 */
public class LoginBankSystem extends Menu<String> {

    static String[] mc = {"Vietnamese", "English", "Exit"};
    LoginBankRepository program;
    Locale vietnamese = new Locale("vi");
    Locale english = Locale.ENGLISH;

    public LoginBankSystem() {
        super("\nLogin Program", mc);
        program = new LoginBankRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.login(vietnamese);
                break;
            case 2:
                program.login(english);
                break;
            case 3:
                System.exit(0);
        }
    }

}

