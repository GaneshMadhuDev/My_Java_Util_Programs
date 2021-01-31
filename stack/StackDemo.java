/**
 * Created by ganeshmadhu on 1/30/21.
 */

import java.util.Stack;

/**
 * use the Stack() constructor of this class. The below example creates an empty Stack.
 *
 * Stack<E> stack = new Stack<E>();
 *
 * basic principle of last-in-first-out.
 *
 * basic push and pop operations
 *
 * the class provides three more functions of empty, search, and peek.
 *
 * Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>
 */
public class StackDemo {


    public void stackDemoExample() {

        Stack<Integer> myNumbersStack  = new Stack<Integer>();

        for  (int number = 0; number < 50; number++) {
            myNumbersStack.push(number);
        }

        Integer topPeekElement = (Integer) myNumbersStack.peek();

        System.out.println("My Number Stack Top Peek Element : " + topPeekElement);

        Integer myElementPositionInStack = (Integer) myNumbersStack.search(32);

        System.out.println("My Element 32 Found at Position in Stack is : " + myElementPositionInStack);

        // removing elements from the stack

        System.out.println("Poping element from Stack is: " + myNumbersStack.pop());

        System.out.println(myNumbersStack);

    }


}
