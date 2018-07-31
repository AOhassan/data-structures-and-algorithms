package day11;

import java.util.Stack;

class QueueWithStacks {
    public Stack<Integer> s1;
    public Stack<Integer> s2;

    public QueueWithStacks() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void enqueue(int number) {
        s1.push(number);
    }
    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        int result = s2.pop();

        if(s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        return result;
    }
    public int[] toArray(){
        int count = 0;
        while(!s1.isEmpty()){
            s1.pop();
            count++;
        }

        int[] aa = new int[count];
        int i = 0;
        while(!s1.isEmpty()){
            aa[i] = s1.pop();
        }
        return aa;
    }
}

