package com.example.CodingPractice.umakscreening;

import java.util.Scanner;

public class LinkedList {
    public static Node head = null;

    public static <T> void add(int val){
        Node newNode = new Node(val, null);
        if (head == null){
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public static <T> void edit(int val, int newVal){
        Node curr = head;
        while (curr.next != null && !(curr.value == val)) {
            curr = curr.next;
        }
        curr.value = newVal;
    }

    public static <T> void delete(int val){
        Node curr = head;
        if(head.value == val){
            head = head.next;
        }

        while (curr.next.next != null) {
            if(curr.next.value == val){
                curr.next = curr.next.next;
            }
            else
                curr = curr.next;
        }
        if(curr.next.value == val){
            curr.next = null;
        }
    }
    public static <T> void insert(int idx, int val){
        Node newNode = new Node(val, null);
        if (head == null){
            head = newNode;
        } else {
            
        }
    }



    public static void printNodes(){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }

    public static <T> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ans;
        do{
            System.out.println("\n1. Add");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Insert");
            System.out.println("5. Exit");

            System.out.println("Answer: ");
            ans = scanner.nextInt();

            switch(ans){
                case 1:
                    System.out.println("Enter value to add: ");
                    int value = scanner.nextInt();
                    add(value);

                    break;
                case 2:
                    System.out.println("Enter value to edit: ");
                    int val1 = scanner.nextInt();
                    System.out.println("Enter new value: ");
                    int val2 = scanner.nextInt();
                    edit(val1,val2);
                    break;
                case 3:
                    System.out.println("Enter value to delete: ");
                    int val3 = scanner.nextInt();
                    delete(val3);
                default:
                    break;
            }
            printNodes();

        } while(ans != 5);


     }

}
