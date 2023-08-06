package oopsC.poly;

import java.io.FileInputStream;
import java.io.InputStream;

public class Guest {

    public static void main(String[] args) {

        WaterTank waterTank= new Glass();

        waterTank.serve();
        waterTank.tap();

    }
}
