import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeExampleTest {

    Node ls;

    @BeforeEach
    void setUp() {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        a.item = 4;
        a.next = b;
        b.item = 8;
        b.next = c;
        c.item = 5;
        c.next = null; // Not needed
        ls = a;
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
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        a.item = -4;
        a.next = b;
        b.item = -8;
        b.next = c;
        c.item = -5;
        c.next = null; // Not needed
        ls = a;
        assertEquals(-4,NodeExample.maxIterative(ls));

    }
}