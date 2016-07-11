package pkg;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Created by Jonathan on 4/21/2016.
 */
public class TestFieldType {

    private static int testInt = 1;
    private static byte testByte = 2;
    private static short testShort = 3;
    private static long testLong = 4;
    private static double testDouble = 5.0;
    private static float testFloat = 6.0f;
    private float testFloat2 = 6.0f;

    public void test() {
        Buffer buffer = ByteBuffer.allocateDirect(22);
        if (Math.random() == 1000) {
            int testInt = 1;
            testInt = 4;
            System.out.println(testInt);
        } else {
            int testInt = 2;
            testInt = 3;
            System.out.println(testInt);
        }
        byte testByte = 2;
        short testShort = 3;
        long testLong = 4;
        double testDouble = 5.0;
        float testFloat = 6.0f;

        System.out.println(buffer);
        System.out.println(testInt + ", " + testByte + ", " + testShort + ", " + testLong + ", " + testDouble + ", " + testFloat);
    }

}
