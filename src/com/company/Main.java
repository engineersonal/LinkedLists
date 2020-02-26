package com.company;
import java.util.*;


public class Main {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        int index = s.nextInt();
        addAtGivenIndex(k, index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to add the element at the front of the LinkedList
    static void addAtGivenIndex(int k, int index) {
        // Write your code here
        if (head == null)
        {
            head = new Node(k);
            return;
        }
        Node temp = head;
        int counter = 0;
        while(temp.next != null){
            if(index == 0){
                break;
            }else if(counter == (index-1)){
                break;
            }
            temp = temp.next;
            counter++;
        }
        if(index != 0) {
            Node newNode = new Node(k);
            newNode.next = temp.next;
            temp.next = newNode;
        }else{
            Node headNode = new Node(k);
            headNode.next = temp;
            head = headNode;
        }
    }
}



