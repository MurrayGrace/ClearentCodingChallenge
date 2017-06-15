/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author caitl
 */
public class Person {
    private ArrayList<Wallet> wallets;
    
    public Person(){
        wallets  = new ArrayList<>();
    }
    
    public int addWallet(Wallet wallet){
        wallets.add(wallet);
        return wallets.indexOf(wallet);
    }
    
    public boolean removeWalletIfOnPerson(int index){
        try{wallets.remove(index);}
        catch(IndexOutOfBoundsException ex){return false;}
        return true;
    }
    
    public Wallet getWallet(int index){
        return wallets.get(index);
    }
    
    public Iterator getWalletIterator(){
        return wallets.iterator();
    }
}
