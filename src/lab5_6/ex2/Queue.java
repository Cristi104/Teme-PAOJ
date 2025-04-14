package lab5_6.ex2;

import lab5_6.ex1.Task;

public class Queue implements Container{
    Task [] storage;
    int size;

    Queue(){
        this.storage = new Task[1000];
        this.size = 0;
    }

    @Override
    public void push(Task t) {
        if(this.size < 1000){
            this.storage[this.size] = t;
            this.size++;
        }
    }

    @Override
    public Task pop() {
        if(this.size > 0){
            this.size--;
            Task temp = this.storage[0];
            System.arraycopy(this.storage, 1, this.storage, 0, this.size);
            return temp;
        }
        return null;
    }
}
