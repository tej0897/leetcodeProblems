package Medium;

//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class AddTwoNumbers {

    // convert Integer to List
    public static Node convertList(int num){
        Node l = null;
        while(num != 0){
            l = new Node(num%10, l);
            num = num/10;
        }
        return l;
    }

    // convert List to Integer
    public static int toInteger(Node l){
        Node curr = l;
        int ans = 0;
        while(curr != null){
            ans = ans*10 + curr.data;
            curr = curr.next;
        }
        return ans;
    }

    // reverse method to reverse
    // the Linked List
    public static Node reverse(Node head){
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
        return head;
    }

    public static Node addList(Node l1, Node l2){
        l1 = reverse(l1);
        l2 = reverse(l2);
        int num1 = toInteger(l1);
        int num2 = toInteger(l2);
        int sum = num1 + num2;
        Node l3 = convertList(sum);
        l3 = reverse(l3);
        return l3;
    }

    public static void printList(Node ans){
        Node curr = ans;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }


    public static void main(String[] args) {
        int x = 243;
        int y = 564;
        Node l1 = convertList(x);
        Node l2 = convertList(y);
        Node ans = addList(l1, l2);
        printList(ans);
    }
}
