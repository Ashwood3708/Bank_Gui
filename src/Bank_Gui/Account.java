/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Gui;

import java.util.*;


/**
 *
 * @author Abdul
 */
class Account {
    private AccountType accountType;
    private String accountNum;
    private double balance;
    private ArrayList<Transaction> transactions;
    
    public Account(){
    accountType = AccountType.checking;    
    transactions = new ArrayList<>();
    accountNum = " N/a";
    balance = 0.0;
    }
    
    //getter and setter methods for all properties
    
    public AccountType getAccountType(){
    return accountType;
    }
    public void setAccountType(AccountType now){
    accountType = now;
    }
    public void setAccountNum(String num){
    accountNum = num;
    }
    public String getAccountNum(){
    return accountNum;
    }
    public void setBalance(double num){
    balance = num;
    }
    public double getBalance(){
    return balance;
    }

    //Return the number of items in the ArrayList transactions
    public int getNumOfTrans(){
    return transactions.size(); 
    }
    //get the Widget at location index in ArrayList transactions
    public Transaction getTrans(int index){
    return transactions.get(index); 
    }
  
    //store item at location index in the ArrayList transactions.
    public void setTrans(int index, Transaction newTrans){
        
        double temp = transactions.get(index).getAmount();
        //undo balance at index
        switch (newTrans.getTransactionType()){
            case credit: balance-= newTrans.getAmount(); 
                        break;
            case  debit: balance += newTrans.getAmount();
                        break;
            case transfer: break;
    }     //replace transaction at index
    transactions.add(index, newTrans);
         // update balance
    switch (newTrans.getTransactionType()){
            case credit: balance += newTrans.getAmount(); 
                        break;
            case  debit: balance -= newTrans.getAmount();
                        break;
            case transfer: break;
    }
    
    }

    //Append the transaction to the ArrayList
    public void addTrans(Transaction newTrans){
    transactions.add(newTrans);
    
    switch (newTrans.getTransactionType()){
            case credit: 
                balance += newTrans.getAmount(); 
                break;
            case debit: balance -= newTrans.getAmount();
                break;
            case transfer: break;
    }
    }
    //Remove and return the Widget at location index.
    public Transaction deleteTrans(int index){
    Transaction eat = transactions.get(index);
    switch (eat.getTransactionType()){
        //undo balance at index
            case credit: balance -= eat.getAmount(); 
                        break;
            case  debit: balance += eat.getAmount();
                        break;
            case transfer: break;
    }
    transactions.remove(index);
    return eat;
    }
    
     public String toString(){
   String hit = "";
   for(int i = 0; i<transactions.size(); i++){
   hit += transactions.get(i).toString() ;
   }
 return accountType + "#" + accountNum + "#" + balance + "#" + transactions.size() + System.getProperty("line.separator") + hit;
    }
    
    
    
    
  
}
