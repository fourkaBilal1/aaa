package Main;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ABRTest {
    ABR tester = new ABR();
    /**
     une fonction test: isEmptyTest da da da daaaaaaaaa
     */
    @Test
    public void isEmptyTest(){
        assertTrue(tester.isEmpty(), "isEmpty() must return true");
    }
    /**
     une fonction test:insertTest da da da daaaaaaaaa
     */
    @Test
    public void insertTest(){
        assertEquals(10, tester.insert(null,10,1).key, "insert() must add 10");
    }
    /**
     une fonction test: nbElementsTest da da da daaaaaaaaa
     */
    @Test
    public void nbElementsTest(){
        tester.insert(null,10,1);
        tester.insert(null,10,1);
        tester.insert(null,11,0);
        tester.insert(null,9,0);
        assertEquals(4, tester.nbElements(), "nbElements() must return 1");
    }
    /**
     une fonction test: toListTest da da da daaaaaaaaa
     */
    @Test
    public void toListTest(){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(8);A.add(9);A.add(10);A.add(10);A.add(11);
        tester.insert(null,10,1);
        tester.insert(null,11,0);
        tester.insert(null,9,0);
        tester.insert(null,10,0);
        tester.insert(null,8,0);
        assertEquals(A.toString(), tester.toList().toString(), "toList() must return [8,9,10,10,11]");
    }
    /**
     une fonction test: containsTest da da da daaaaaaaaa
     */

    @Test
    public void containsTest(){
        tester.insert(null,10,1);
        tester.insert(null,11,0);
        tester.insert(null,9,0);
        tester.insert(null,10,0);
        tester.insert(null,8,0);
        assertTrue(tester.contains(9), "contains(9) must return true");
    }
}