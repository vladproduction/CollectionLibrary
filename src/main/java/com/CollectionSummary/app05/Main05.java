package com.CollectionSummary.app05;

import java.util.Stack;

public class Main05 {

    /*

    first in
    last out

     */
    public static void main(String[] args) {
        Stack stack = new Stack();

        //add items to stack
        System.out.println("----------push()------------");
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");//the most hot blinchik
        System.out.println(stack);
        System.out.println("----------peek()------------");
        //return top; return most hot blinchik
        Object topItem = stack.peek();
        System.out.println("topItem="+topItem);
        topItem = stack.peek();
        System.out.println("topItem="+topItem);
        topItem = stack.peek();
        System.out.println("topItem="+topItem);
        System.out.println("size="+stack.size());

        System.out.println("----------pop()------------");
        Object item = stack.pop();
        System.out.println("item="+item);
        System.out.println("size="+stack.size());
        item = stack.pop();
        System.out.println("item="+item);
        System.out.println("size="+stack.size());
        item = stack.pop();
        System.out.println("item="+item);
        System.out.println("size="+stack.size());
        item = stack.pop();
        System.out.println("item="+item);
        System.out.println("size="+stack.size());
        item = stack.pop();
        System.out.println("item="+item);
        System.out.println("size="+stack.size());

        System.out.println("------pop() on empty stack---------");
        //java.util.EmptyStackException
        //stack.pop();

    }
}
