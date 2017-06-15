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
public class VisaCard extends Cards.CreditCardObject{
    private BigDecimal visaCardInterestRate = new BigDecimal("0.10");
    
    public VisaCard(){
        this.setInterestRate(visaCardInterestRate);
    }
}
