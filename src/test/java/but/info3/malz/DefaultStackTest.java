package but.info3.malz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStackTest {

    @Test
    @DisplayName("Test of the isEmpty method")
    void isEmpty() {
        // Given an empty stack and a non empty stack
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
    void getSize() {
    }

    @Test
    void push() {
        // Given an Item and an empty stack
        DefaultStack stack = new DefaultStack();
        DefaultItem item = new DefaultItem();

        // When I push the item on the top of the stack
        stack.push(item);

        // Then the stack isn't empty anymore
        // AND if I peek the stack, it should return the item I pushed
        assertFalse(stack.isEmpty(), "Wrong, the stack contain an item");
        assertTrue(stack.peek() == item,
                "Wrong, the item that supposed to peek is the item i pushed");
    }

    @Test
    void peek() {

    }

    @Test
    void pop() {
    }
}