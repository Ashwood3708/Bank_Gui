/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Gui;

import java.util.*;

import javax.swing.JOptionPane;


/**
 *
 * @author Abdul
 */
class Customer {
    private String firstName;
    private String lastName;
    private int customerID;
    private String dob;
    private String address;
    private String phoneNumber;
    private int pin;
    private ArrayList<Account> accounts;
    
    public Customer(){
    firstName = "N/a";
    lastName = "N/a";
    customerID = 0;
    dob = "N/a";
    address = "N/a";
    phoneNumber = "N/a";
    pin = 0;
    accounts = new ArrayList<>();
    }
    
    public void setFirstName(String num){
    firstName = num;
    }
    public String getFirstName(){
    return firstName;
    }
    public void setLastName(String num){
    lastName = num;
    }
    public String getLastName(){
    return lastName;
    }
    public void setDob(String num){
    dob = num;
    }
    public String getDob(){
    return dob;
    }
    public void setAddress(String num){
    address = num;
    }
    public String getAddress(){
    return address;
    }
    public void setPhoneNumber(String num){
    phoneNumber = num;
    }
    public String getPhoneNumber(){
    return phoneNumber;
    }
    public int getCustomerID(){
    return customerID;
    }
    public void setCustomerID(int num){
      char[] digits = String.valueOf(num).toCharArray();
      char i = digits[0];
        if(i == '0'){
        JOptionPane.showMessageDialog(null, "Customer ID cannot begin with 0");
        System.exit(-1);
        }else{
    customerID = num;
    }
        
    }
  
    public int getPin(){
    return pin;
    }
    public void setPin(int num){
    pin = num;
    }
    
    //Return the number of items in the ArrayList of accounts
    public int getNumOfAccs(){
    return accounts.size();
    }
    //get the account at location index in ArrayList of Accounts
    public Account getAccs(int index){
    return accounts.get(index); 
    }
    //store item at location index in the ArrayList of Accounts
    public void setAccs(int index, Account newAccs){
    accounts.add(index, newAccs);
    }
    //Add the Acccount to the ArrayList
    public void addAccs(Account newAccs){
    accounts.add(newAccs);
    }
    //Remove and return the Account at the Array index.
    public Account deleteAcc(int index){
        Account eat = accounts.get(index);
    accounts.remove(index);
    return eat;
    }
    
     public String toString(){
   String hit = "";
   for(int i = 0; i<accounts.size(); i++){

   hit += accounts.get(i).toString();
   }
 return firstName + "#" + lastName + "#" + customerID + "#" + dob + "#" 
         + address + "#" + phoneNumber + "#" + pin + "#" + accounts.size() 
         +  System.getProperty("line.separator") + hit;
     }    
    
}
