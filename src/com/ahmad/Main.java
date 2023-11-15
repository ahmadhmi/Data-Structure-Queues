package com.ahmad;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        PriorityQueue test = new PriorityQueue(6);
        test.insert(1);
        test.insert(2);
        test.insert(3);
        test.insert(1);
        test.insert(5);
        test.insert(0);
        System.out.println(test);
    }
}
