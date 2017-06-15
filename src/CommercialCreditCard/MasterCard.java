/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommercialCreditCard;

import java.math.BigDecimal;

/**
 *
 * @author caitl
 */
public class MasterCard extends Cards.CreditCardObject{
    private BigDecimal masterCardInterestRate = new BigDecimal("0.05");
    
    public MasterCard(){
        this.setInterestRate(masterCardInterestRate);
    }
}
