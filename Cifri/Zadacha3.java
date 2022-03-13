//BigDecimal "не обича" долни тирета! Установих го по трудния начин.
package Cifri;
import java.math.BigDecimal;

public class Zadacha3 {
    public static void main(String[] args) {
        double prim1 = 4.9876543;
        double prim2 = 7.123456789012345678890;
        BigDecimal prim3 = new BigDecimal("18398458438583853.28");
        BigDecimal prim4 = new BigDecimal("18398458438583853.39875937284928422");
        System.out.println(prim1);
        System.out.println(prim2);
        System.out.println(prim3);
        System.out.println(prim4);


    }
}