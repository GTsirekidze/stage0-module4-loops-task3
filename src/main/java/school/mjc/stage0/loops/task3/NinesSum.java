package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int ans=0,cur=0;

        for(int i=1;i<=lengthOfLastNumber;i++){
            cur=cur*10+9;
            ans+=cur;
        }
        System.out.println(ans);
    }
}
