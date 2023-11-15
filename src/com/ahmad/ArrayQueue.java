package com.ahmad;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array;
    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity){
        array = new int[capacity];
    }

    public boolean isFull(){
        return array.length == count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void enqueue(int num){
        if (isFull())
            throw new IllegalStateException();
        array[rear] = num;
        rear = (rear + 1) % array.length;
        count++;
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();
        int item = array[front++];
        array[front] = 0;
        front = (front + 1) % array.length;
        count--;
        return item;
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        else
            return array[front];
    }


    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(array, front, rear+1);
        return Arrays.toString(content);
    }





}
