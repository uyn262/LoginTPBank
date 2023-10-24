/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.Locale;
import dataAccess.LoginBankDAO;

/**
 *
 * @author Admin
 */
public class LoginBankRepository implements ILoginBankRepository{

    @Override
    public void login(Locale language) {
        LoginBankDAO.Instance().login(language);
    }
}
