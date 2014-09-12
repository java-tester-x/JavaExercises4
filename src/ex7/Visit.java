package src.ex7;

import java.util.Date;

/**
 * The Discount System: Visit.
 */
public class Visit
{
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, Date date)
    {
        this.customer   = new Customer(name);
        this.date       = date;
    }
    
    public String getName() {
        return customer.getName();
    }
    
    public double getServiceExpense() {
        return serviceExpense;
    }
    
    public void setServiceExpense(double ex) {
        serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }
    
    public void setProductExpense(double ex) {
        productExpense = ex;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }
    
    public String toString() {
        return String.format("Visit of customer %1$s at date %2$s"
                            , customer.toString(), date.toString());
    }
}
