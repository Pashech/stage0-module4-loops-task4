package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
            return;
        }

        if (lastInRow < 0){
            System.out.println("last number in row is negative");
            return;
        }

        int sum = 0;
        int skippedSum = 0;

        for (int i = 0; i <= numberToSkip; i++){
            skippedSum += i;
        }

        for(int i = 0; i <= lastInRow; i++){
            sum += i;
        }
        sum = sum - skippedSum;
        System.out.println("skipped sum is " + skippedSum + "\n" + "counted sum is " + sum);
    }
}
