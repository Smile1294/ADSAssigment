package Interfaces;

import Model.LinkedStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void isEmpty() {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void push() {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        System.out.println(stack + " Stack has pushed this item inside");
        assertFalse(stack.isEmpty());
    }

    @Test
    void pop() {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.pop();
        System.out.println(stack + " Stack has poped item out");
        assertTrue(stack.isEmpty());
    }
}