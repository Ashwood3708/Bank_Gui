/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Gui;

import java.util.*;
import java.io.*;

/**
 *
 * @author Abdul
 */
class CyberBank {

    private String bankName;
    private String address;
    private String phoneNumber;
    private double bankBalance;
    private ArrayList<Customer> customers;

    public CyberBank() {
        bankName = "N/a";
        address = "N/a";
        phoneNumber = "N/a";
        bankBalance = 0.0;
        customers = new ArrayList<>();
    }

    public void setBankName(String num) {
        bankName = num;
    }

    public String getBankName() {
        return bankName;
    }

    public void setAddress(String num) {
        address = num;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNum(String num) {
        phoneNumber = num;
    }

    public String getPhoneNum() {
        return phoneNumber;
    }

    public void setBalance(double num) {
        bankBalance = num;
    }

    public double getBalance() {
        return bankBalance;
    }

    //Return the number of items in the ArrayList of customers
    public int getNumOfCusts() {
        return customers.size();
    }

    //get the account at location index in ArrayList of customers
    public Customer getCusts(int index) {
        return customers.get(index);
    }

    //store item at location index in the ArrayList of customers
    public void setCusts(int index, Customer newCusts) {
        customers.add(index, newCusts);
    }

    //Add the customer to the ArrayList
    public void addCusts(Customer newCusts) {
        customers.add(newCusts);
    }

    //Remove and return the customer at the Array index.

    public Customer deleteCusts(int index) {

        Customer eat = customers.get(index);
        customers.remove(index);
        return eat;
    }

    public Customer authenticateCustomer(int custID, int newPin) {

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCustomerID() == custID) {
                if (customers.get(i).getPin() == newPin) {
                    return customers.get(i);

                }
            }
        }
        return null;
    }


    public void loadBankData(String filename) {
        try {
            Scanner inFile = new Scanner(new FileReader(filename));
            inFile.useDelimiter("\\r\\n|#");
            int numAcc = 0, numTrans = 0;

            while (inFile.hasNext()) {
                bankName = inFile.next();
                address = inFile.next();
                phoneNumber = inFile.next();

                while (inFile.hasNext()) {
                    Customer wT = new Customer();
                    wT.setFirstName(inFile.next());
                    wT.setLastName(inFile.next());
                    wT.setCustomerID(inFile.nextInt());
                    wT.setDob(inFile.next());
                    wT.setAddress(inFile.next());
                    wT.setPhoneNumber(inFile.next());
                    wT.setPin(inFile.nextInt());
                    numAcc = inFile.nextInt();

                    for (int i = 0; i < numAcc; i++) {
                        Account A1 = new Account();
                        A1.setAccountType(AccountType.valueOf(inFile.next()));
                        A1.setAccountNum(inFile.next());
                        A1.setBalance(inFile.nextDouble());
                        numTrans = inFile.nextInt();

                        for (int j = 0; j < numTrans; j++) {

                            Transaction T1 = new Transaction();
                            T1.setTransactionType(TransactionType.valueOf(inFile.next()));
                            T1.setDate(inFile.next());
                            T1.setAmount(inFile.nextDouble());
                            T1.setDescription(inFile.next());
                            A1.addTrans(T1);

                        }
                        wT.addAccs(A1);

                    }
                    customers.add(wT);

                }
            }

        } catch (IOException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
            System.exit(-1);
        }
    }

    public String toString() {
        String hit = "";
        for (int i = 0; i < customers.size(); i++) {
            hit += customers.get(i).toString();

        }
        return bankName + "#" + address + "#" + phoneNumber + "#" + bankBalance + "#" + System.getProperty("line.separator") + hit;
    }

    public void saveBankData(String inputFileName) {

        try{
          
        PrintWriter ret = new PrintWriter(inputFileName,"UTF-8"); 
        ret.print(this.toString());
        ret.close();
        
        } catch (IOException e) {
            System.err.println("File Not Found Exception: " + e.getMessage());
            System.exit(-1);
        }

    }


}
