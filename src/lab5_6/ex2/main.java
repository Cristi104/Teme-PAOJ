package lab5_6.ex2;

import lab5_6.ex1.OutTask;

public class main {
    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new Queue();

        System.out.println("Stack");
        s.push(new OutTask("1"));
        s.push(new OutTask("2"));
        s.push(new OutTask("3"));

        s.pop().task();
        s.pop().task();
        s.pop().task();

        System.out.println("Queue");
        q.push(new OutTask("1"));
        q.push(new OutTask("2"));
        q.push(new OutTask("3"));

        q.pop().task();
        q.pop().task();
        q.pop().task();
    }
}
