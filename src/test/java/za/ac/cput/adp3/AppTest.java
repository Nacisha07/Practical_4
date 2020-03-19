package za.ac.cput.adp3;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    List<String> expectedList = new ArrayList<>();
    List<String> resultList = new ArrayList<>();

    Map<Integer, String> expectedMap;
    Map<Integer, String> resultMap;

    Set<Integer> expectedSet;

    boolean hasMapIsTrue = false;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public void setMaps() {
        expectedMap = new HashMap<>();
        expectedMap.put(1, "Nacisha");
        expectedMap.put(2, "Courtney");
        expectedMap.put(3, "Anika");

        resultMap = new HashMap<>();
        resultMap.put(1, "Nacisha");
        resultMap.put(2, "Courtney");
        resultMap.put(3, "Anika");
    }

    @Test
    public void testMapHasMap() {
        setMaps();
        Assert.assertTrue("Equality is true.",
                expectedMap.equals(resultMap));
        hasMapIsTrue = true;

    }

    @Test
    public void testKeys() {

        testMapHasMap();

        if (hasMapIsTrue) {
            expectedSet = expectedMap.keySet();
            Assert.assertEquals(expectedSet, resultMap.keySet());
        }

    }

    @Test
    public void testList() {

        testMapHasMap();

        if (hasMapIsTrue) {
            expectedList.add("Nacisha");
            expectedList.add("Courtney");
            expectedList.add("Anika");

            Collection<String> collectResult = Collections.unmodifiableCollection(resultMap.values());
            resultList.addAll(collectResult);

            Assert.assertEquals("It is as expected.", expectedList, resultList);
        }
    }
}
