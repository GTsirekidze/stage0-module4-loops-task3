package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int ans = 0;
        for(int i=firstBoarder;i<=secondBoarder;i++){
          ans+=i;
        }
        System.out.println(ans);
    }
}
