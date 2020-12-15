/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsystem;

import javax.swing.JProgressBar;
/**
 *
 * @author HP
 */
public class SMSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SplashScreen obj=new SplashScreen();
        obj.setVisible(true);
        try{
        for(int i=0;i<=100;i++)
        {
            Thread.sleep(100);
            obj.jProgressBar1.setValue(i);
        }
        obj.dispose();
        HomePage hp=new HomePage();
        hp.setVisible(true);
        }
        catch(Exception e){
                
        }
    }
    
}
