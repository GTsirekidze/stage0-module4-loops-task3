package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public void printDigitsSum(int t){
        String number = Integer.toString(t);
        int ans=0,i=number.charAt(0) == '-'?1:0;
        for(; i<number.length(); i++){
            ans+=number.charAt(i) -'0';
        }
        System.out.println(ans);
    }
}
