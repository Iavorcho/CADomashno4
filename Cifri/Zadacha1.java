//От просто домашно стана сложно, защото исках големите цифри да излизат без "Scientific notation"
//След като намерих начини за форматиране се оказа, че по някаква причина целите числа се закръглят и се губи точност
//Е, на края вместо float използвах double и нещата се случиха. Усетих се, че все пак условието е да извадим променливата с println и минах на BigInteger
package Cifri;
import java.math.BigInteger;
public class Zadacha1 {
    public static void main(String[] args) {
    short prim1 = -250;
    short prim2 = 250;
    int prim3 = 4589498;
//    double prim4 = 10000000000000000000d;
//    double prim5 = -9000000000000000000d;
        BigInteger prim4 = new BigInteger("10000000000000000000");
        BigInteger prim5 = new BigInteger("-9000000000000000000");
            System.out.println(prim1);
        System.out.println(prim2);
        System.out.println(prim3);
        System.out.println(prim4);
        System.out.println(prim5);
//        System.out.printf("%5.0f%n",prim4);
//        System.out.printf("%5.0f%n",prim5);

    }

}
