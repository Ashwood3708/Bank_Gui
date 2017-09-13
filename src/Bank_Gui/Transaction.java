/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Gui;

/**
 *
 * @author Abdul
 */
class Transaction {
    private TransactionType transactionType;
    private String date;
    private double amount;
    private String description;
    
    
    public Transaction(){
    transactionType = TransactionType.credit;
    date = "12/25/2017";
    amount = 0.0;
    description = " N/a";
    }
    // getter and setter methods for all properties
    public TransactionType getTransactionType(){
    return transactionType;
    }
    public void setTransactionType(TransactionType now){
    transactionType = now;
    }
    public String getDate(){
    return date;
    }
    public void setDate(String newdate){
    date = newdate;
    }
    public double getAmount(){
    return amount;
    }
    public void setAmount(double newAmount){
    amount = newAmount;
    }
    public String getDescription(){
    return description;
    }
    public void setDescription(String newdec){
    description = newdec;
    }
    public String toString(){
    return transactionType + "#" + date + "#" + amount + "#" + description + System.getProperty("line.separator");
    }
    
    
      
}
