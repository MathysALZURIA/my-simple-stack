package but.info3.malz;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Class DefaultStack.
 * TONTON LE BOSS OAH
 */
public class DefaultStack implements SimpleStack {
    private ArrayList<Item> stack;

    /**
     * Constructor
     */
    public DefaultStack() {
        this.stack = new ArrayList<Item>();
    }

    /**
     * Tests if this stack is empty.
     *
     * @return boolean true if SimpleStack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return int, the size of the SimpleStack
     */
    @Override
    public int getSize() {
        return stack.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item the item to push on the stack
     */
    @Override
    public void push(final Item item) {
        stack.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     *
     * @return Item, the item at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item peek() throws EmptyStackException {
        return stack.get(stack.size()-1);
    }

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     *
     * @return Item, the item at the top of this stack
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        Item itemRemoved = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return itemRemoved;
    }
}
