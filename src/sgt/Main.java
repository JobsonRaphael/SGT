/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgt;

import view.FrmLogin;

/**
 *
 * @author PICHAU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        FrmLogin frmLogin = new FrmLogin(); 
               
        frmLogin.setVisible(true);
        frmLogin.setDefaultCloseOperation(frmLogin.EXIT_ON_CLOSE);

    }
    
}
