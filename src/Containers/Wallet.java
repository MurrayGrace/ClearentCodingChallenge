/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;
import java.util.ArrayList;
import Cards.CreditCardObject;
import java.util.Iterator;
/**
 *
 * @author caitl
 */
public class Wallet{
    private ArrayList<CreditCardObject> creditCards;
    
    public Wallet(){
        creditCards  = new ArrayList<>();
    }
    
    public int addCreditCard(CreditCardObject creditCard){
        creditCards.add(creditCard);
        return creditCards.indexOf(creditCard);
    }
    
    public boolean removeCreditCardIfInWallet(int index){
        try{creditCards.remove(index);}
        catch(IndexOutOfBoundsException ex){return false;}
        return true;
    }
    
    public CreditCardObject getCreditCard(int index){
        return creditCards.get(index);
    }
    
    public Iterator getWalletIterator(){
        return creditCards.iterator();
    }
}
