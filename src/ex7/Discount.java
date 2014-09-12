package src.ex7;

/**
 * The Discount System: Discount.
 */
public class Discount
{
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold    = 0.15;
    private static double serviceDiscountSilver  = 0.1;

    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold    = 0.1;
    private static double productDiscountSilver  = 0.1;

    public static double getServiceDiscountRate(String type) {
        switch(type.toUpperCase()) {
            case "PREMIUM": return serviceDiscountPremium;
            case "GOLD":    return serviceDiscountGold;
            case "SILVER":  return serviceDiscountSilver;
        }
        return 0.0;
    }
    
    public static double getProductDiscountRate(String type) {
        switch(type.toUpperCase()) {
            case "PREMIUM": return productDiscountPremium;
            case "GOLD":    return productDiscountGold;
            case "SILVER":  return productDiscountSilver;
        }
        return 0.0;
    }
}
