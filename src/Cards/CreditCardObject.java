package Cards;
import java.math.BigDecimal;
/**
 * Credit Card Object
 * 
 */
public abstract class CreditCardObject extends Object implements Card{
    //prtected fields
    protected BigDecimal _minCharge = new BigDecimal("0.00");
    protected BigDecimal _minPayment = new BigDecimal("0.01");
    protected BigDecimal _interestRate = new BigDecimal("0.01");
    protected BigDecimal _balance;
    
    //Sets interest Rate using BigDecimal.abs() rater than "="
    protected void setInterestRate(BigDecimal interestRate){
        _interestRate = interestRate.abs();
    }
    
    //public fields
    public CreditCardObject(){ //Constructor
        _balance = new BigDecimal(0);
    }
    
    public void addToBalance(double charge) throws IllegalArgumentException{
        BigDecimal bdCharge = new BigDecimal(charge);
        if (_minCharge.compareTo(bdCharge) == -1){
            _balance = _balance.add(bdCharge);
        }else{
            throw new IllegalArgumentException("Deposits must be greater than " + _minCharge.toPlainString());
        }
    }
    
    public void subtractFromBalance(double payment)throws IllegalArgumentException{
        BigDecimal bdPayment = new BigDecimal(payment);
        if (_minPayment.compareTo(bdPayment) == -1){
            _balance = _balance.subtract(bdPayment);
        }else{
            throw new IllegalArgumentException("Withdrawls must be greater than " + _minCharge.toPlainString());
        }
    }
    
    public double getSimpleInterest(int numMonths)throws IllegalArgumentException{
        BigDecimal multiplicand = new BigDecimal(numMonths);
        BigDecimal singleMonthInterest, totalInterest;
        if (numMonths >= 0){
            singleMonthInterest = _balance.multiply(_interestRate);
            totalInterest = singleMonthInterest.multiply(multiplicand);
        }
        else{
            throw new IllegalArgumentException("Number of months must be a positive integer");
        }
        return totalInterest.doubleValue();
    }
}
