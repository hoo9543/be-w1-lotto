package lotto;

import java.util.ArrayList;

public class Output {

    public void printLottoResult(int matchNumbers, int count){
        switch(matchNumbers) {
            case 3: System.out.print("3개 일치 (5000원)- ");
                    break;
            case 4: System.out.print("4개 일치 (50000원)- ");
                    break;
            case 5: System.out.print("5개 일치 (1500000원)- ");
                    break;
            case 6: System.out.print("6개 일치 (2000000000원)- ");
                    break;
        }
        System.out.println(count+"개");
    }

    public void printResultString(){
        System.out.println("");
        System.out.println("당첨통계");
        System.out.println("--------");
    }

    public void printProfitRate(int input,ArrayList<Integer> count){
        int revenue = sumRevenue(count);
        System.out.println("총 수익률은 "+ (revenue-input)/input*100 +"%입니다.");

    }

    private int sumRevenue(ArrayList<Integer> count){
        return  5000 * count.get(3) +
                50000 * count.get(4) +
                1500000 * count.get(5) +
                2000000000 * count.get(6);
    }

    public void printLottoPurchase(int lottoNum){
        System.out.println( lottoNum + "개를 구매했습니다.");

    }

}
