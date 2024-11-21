import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {
    public static void main(String[] args){
        double productNetPrice = 9.99;
        double taxValue = 1.23;

        //calculating gross value using double variable
        double soldProdGrossValue = productNetPrice * taxValue * 10000;
        System.out.println("Gross value = " + soldProdGrossValue);

        //calculating net value using double variable
        double soldProdNetValue = productNetPrice * 10000;
        System.out.println("Net value = "+ soldProdNetValue);

        System.out.println("\nthe same calculations but using big decimal: ");

        BigDecimal bdNetPrice = new BigDecimal("9.99");
        BigDecimal bdTaxValue = new BigDecimal("1.23");
        BigDecimal bdQuantity = new BigDecimal("10000");

        //calculating gross value using big decimal
        BigDecimal bdGrossValue = bdNetPrice.multiply(bdTaxValue).multiply(bdQuantity);
        bdGrossValue = bdGrossValue.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Gross value = " + bdGrossValue);

        //calculating net value using big decimal
        BigDecimal bdNetValue = bdNetPrice.multiply(bdQuantity);
        bdNetValue = bdNetValue.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Net value = " + bdNetValue);


    }
}
