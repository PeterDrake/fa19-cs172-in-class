import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeExampleTest {

    Node ls;

    @BeforeEach
    void setUp() {
        ls = arrayToList(new int[] {4,8,5});
    }

    @Test
    void recursivelySumsEmptyList() {
        assertEquals(0, NodeExample.sumRecursive(null));
    }

    @Test
    void recursivelySumsNonEmptyList() {
        assertEquals(17, NodeExample.sumRecursive(ls));
    }

    @Test
    void iterativelySumsEmptyList() {
        assertEquals(0, NodeExample.sumIterative(null));
    }

    @Test
    void iterativelySumsNonEmptyList() {
        assertEquals(17, NodeExample.sumIterative(ls));
    }
    @Test
    void recursivelyFindsMax(){
        assertEquals(8,NodeExample.maxRecursive(ls));

    }
    @Test
    void iterativelyFindsMax(){
        assertEquals(8,NodeExample.maxIterative(ls));

    }
    @Test
    void iterativelyFindsMaxOfNegativeNumbers(){
        ls = arrayToList(new int[] {-4,-8,-5});
        assertEquals(-4,NodeExample.maxIterative(ls));

    }
    @Test
    void recognizesEqualLists(){
        Node a = arrayToList(new int[] {1,2,3});
        Node b = arrayToList(new int[] {1,2,3});
        assertTrue(NodeExample.equals(a,b));
    }
    @Test
    void recognizesUnequalLists(){
        Node a = arrayToList(new int[] {1,2,3});
        Node b = arrayToList(new int[] {1,2,4});
        assertFalse(NodeExample.equals(a,b));
    }
    @Test
    void convertsListToString(){
        assertEquals("(4,8,5)",NodeExample.toString(ls));
    }
    @Test
    void convertsEmptyListToString(){
        assertEquals("()", NodeExample.toString(null));
    }


    static Node arrayToList(int[] numbers, int i){
        if(i == numbers.length){
            return null;
        } else {
            Node rest = arrayToList(numbers, i+1);
            Node first = new Node();
            first.item = numbers[i];
            first.next = rest;
            return first;
        }
    }
    static Node arrayToList(int[] numbers){
        return arrayToList(numbers, 0);
    }

}