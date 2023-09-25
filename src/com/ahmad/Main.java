package com.ahmad;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue){
        //add
        //remove
        //isEmpty
        Stack<Integer> stack = new Stack<Integer>();
        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.empty())
            queue.add(stack.pop());
    }
}
