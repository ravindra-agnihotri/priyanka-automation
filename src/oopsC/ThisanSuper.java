package oopsC;

import oopsC.poly.Par;

public class ThisanSuper extends Par {

    ThisanSuper(){
       super();
    }
    public String name="priyanka";
    public static void main(String[] args) {
        ThisanSuper thisanSuper= new ThisanSuper();
        thisanSuper.m();

    }
    public void m(){
        System.out.println(this.name);
        System.out.println(super.n);

    }

}
