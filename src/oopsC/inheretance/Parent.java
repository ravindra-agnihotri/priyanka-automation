package oopsC.inheretance;

import basics.AccessModifier;

import javax.swing.text.AsyncBoxView;

public class Parent extends AccessModifier {

   public static String job= "govt";
   public String car= "BMW";

   public void makaan(){
       System.out.println("2 story");
   }

    public static void tv(){
        System.out.println("akai");
    }

    public static void main(String[] args) {
        System.out.println(AccessModifier.daughter);
        System.out.println();
    }
}
