package but.info3.malz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {

    @Test
    @DisplayName("Test of the isEmpty method")
    void isEmpty() {
        // Given an empty stack and a non-empty stack
        DefaultStack emptyStack = new DefaultStack();
        DefaultStack nonEmptyStack = new DefaultStack();
        DefaultItem item = new DefaultItem();
        nonEmptyStack.push(item);

        // When I test if the stack is empty, the method return
        // true if it's empty, false otherwise

        assertTrue(emptyStack.isEmpty(), "Wrong, the stack is empty");
        assertFalse(nonEmptyStack.isEmpty(), "Wrong, the stack isn't empty");
    }

    @Test
    @DisplayName("Test of the getSize method")
    void getSize() {
        // test de getters ???
    }

    @Test
    @DisplayName("Test of the push method")
    void push() {
        // Given an Item and an empty stack
        DefaultStack stack = new DefaultStack();
        DefaultItem item = new DefaultItem();

        // When I push the item on the top of the stack
        stack.push(item);

        // Then the stack isn't empty anymore
        assertFalse(stack.isEmpty(), "Wrong, the stack contain an item");
        // AND if I peek the stack, it should return the item I pushed
        assertTrue(stack.peek() == item,
                "Wrong, the item that supposed to peek is the item i pushed");
    }

    @Test
    @DisplayName("Test of the peek method")
    void peek() {
        // Given a non-empty stack
        DefaultItem item1 = new DefaultItem();
        DefaultItem item2 = new DefaultItem();
        DefaultStack stack = new DefaultStack();
        stack.push(item1);
        stack.push(item2);

        // When I peek the stack
        // Then it return the item I pushed the last (here item2)
        assertTrue(stack.peek() == item2,
                "Wrong, the item supposed to peek is the pushed the last (here item2)");
    }

    /* @Test
    @DisplayName("Test of the peek method on an empty stack")
    void peekOnEmptyStack() {
        // Given an empty stack
        DefaultStack stack = new DefaultStack();

        // When I peek the stack
        // Then it return the item I pushed the last (here item2)
        assertThrows(stack.peek() == EmptyStackException,
                "Wrong, it's supposed to do an EmptyStackException");
    } */

    @Test
    @DisplayName("Test of the pop method")
    void pop() {
        // Given a non-empty stack
        DefaultItem item1 = new DefaultItem();
        DefaultItem item2 = new DefaultItem();
        DefaultStack stack = new DefaultStack();
        stack.push(item1);
        stack.push(item2);
        int sizeBefore = stack.getSize();

        // When I pop the stack
        // Then it return the item I pushed the last (here item2)
        assertTrue(stack.pop() == item2,
                "Wrong, the item supposed to peek is the pushed the last (here item2)");
        // AND the length of the stack has been reduced of 1
        assertEquals(stack.getSize(), sizeBefore-1,
                "Wrong, the size of the stack must be 1");
    }

    /*@Test
    DisplayName("Test of the pop method on an empty stack")
    void popOnEmptyStack() {
    }*/
}