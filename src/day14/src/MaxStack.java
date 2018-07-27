import java.util.Stack;

public class MaxStack extends Stack {
    private int currentMax;

    void posh(int val){

        if(this.isEmpty()){
            this.push(val);
            currentMax = val;
        } else {
            currentMax = Math.max((Integer) this.peek(), currentMax);
            this.push(val);
        }
    }

    int max(){
        if(this.empty()){
            return 0;
        } else {
            return currentMax;
        }
    }

    public int[] toArr(){
        int count = 0;
        while(!this.isEmpty()){
            this.pop();
            count++;
        }

        int[] aa = new int[count];
        int i = 0;
        while(!this.isEmpty()){
            aa[i] = (int) this.pop();
        }
        return aa;
    }
}
