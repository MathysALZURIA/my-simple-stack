package but.info3.malz;

import java.util.EmptyStackException;

/**
 * Interface SimpleStack.
 */
public interface SimpleStack {

    /**
     * Tests if this stack is empty.
     * @return boolean true if SimpleStack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     * @return int, the size of the SimpleStack
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item the item to push on the stack
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     * @return Item, the item at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     * @return Item, the item at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}
