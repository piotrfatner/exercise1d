package wdsr.exercise1.conversions;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Piotr on 2017-03-08.
 */
public class ArrayConverterTest {
    private ArrayConverter arrayConverter;
    @Before
    public void setup() {
        arrayConverter= new ArrayConverter();
    }

    @Test
    public void testConvertToInts(){
        String [] exampleArray = {"24"};
        int [] a = arrayConverter.convertToInts(exampleArray);
        System.out.println(a[0]);

    }
}
