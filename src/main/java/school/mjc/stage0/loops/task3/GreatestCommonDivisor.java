package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int ans=1;
        if(Math.min(first,second)==0){
            System.out.println(Math.max(first,second));
            return;
        }
        for(int i=1;i<=Math.min(first,second);i++){
            if(first%i==0 && second%i==0)ans=i;
        }
        System.out.println(ans);
    }
}
