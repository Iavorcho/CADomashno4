//Съгласно ЕС директивата за защита на личните данни отказвам да изпълня тази задача!
//Шегувам се :)
package Imena;

public class Zadacha1 {
    public static void main(String[] args) {
        String myName;
        String mySName;
        int myAge;
        String myFrName;
        String myFrSname;
        int myFrAge;
        myName = "Iavor";
        mySName = "Stoyanov";
        myFrName = "Margaritka";
        myFrSname = "Lozova";
        myAge = 41;
        myFrAge = 41;
        System.out.println(myName);
        System.out.println(myName.equals(myFrName));
        System.out.println(myName.equalsIgnoreCase(myFrName));
        System.out.println(myName.compareTo(myFrName));
        System.out.println((myName)+(mySName));
        System.out.println(myAge);
        System.out.println((myName)+" "+(mySName)+" "+(myAge));
        System.out.println((myFrName)+" "+(myFrSname)+" "+(myFrAge));

    }

}
