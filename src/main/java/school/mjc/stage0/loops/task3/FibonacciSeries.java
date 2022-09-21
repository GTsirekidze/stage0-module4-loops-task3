package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0,second=1;
        if(lastFibonacci>0) System.out.println(0);
        if(lastFibonacci>1) System.out.println(1);
        for(int i=3;i<=lastFibonacci;i++){
            int cur = first + second;
            System.out.println(cur);
            first = second;
            second = cur;
        }
    }
}
