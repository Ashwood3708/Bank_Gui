/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Gui;

import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Abdul
 */
public class MajorProject_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException {

        CyberBank bank = new CyberBank();
        //System.out.println(args[0]);
        bank.loadBankData(args[0]);
        
      //JOptionPane.showMessageDialog(null, weed.toString());
        JFrame kick = new JFrame(bank);
        kick.setVisible(true);
        kick.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        

//        Customer John = new Customer();
//        Customer Low = new Customer();
//        CyberBank AMB = new CyberBank();
//
//        if (args.length > 1) {        //if user inputs a load and save file
//            AMB.loadBankData(args[0]);
//            AMB.saveBankData(args[1]);
//
//        } else if (args.length > 0) {   //if user inputs a load a load file only
//
//            String input = JOptionPane.showInputDialog("Enter a file to save to");     //turns string input into file name
//            AMB.loadBankData(args[0]);
//            AMB.saveBankData(input + ".txt");
//
//        } else {      //if no file in args 
//
//            JFileChooser chooser = new JFileChooser();     // allows user to find file to load from
//            int val = chooser.showOpenDialog(null);
//            if (val == JFileChooser.APPROVE_OPTION) {
//                AMB.loadBankData(chooser.getSelectedFile().getName());    //turns filename into string then sends to loadBankData parameter
//            }
//
//            String input = JOptionPane.showInputDialog("Enter a file to save to");    //turns string input into file name
//
//            AMB.saveBankData(input);
//
//        }


    }

}
