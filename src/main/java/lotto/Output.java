package lotto;

import java.util.ArrayList;

public class Output {

    int match3 = 0;
    int match4 = 0;
    int match5 = 0;
    int match6 = 0;

    public void counting(int count){
        switch (count){
            case 3: match3 ++;
                break;
            case 4: match4 ++;
                break;
            case 5: match5 ++;
                break;
            case 6: match6 ++;
                break;
        }
    }


    public void printLottoResult(int matchNumbers, int count){
        switch(matchNumbers) {
            case 3: System.out.print("3개 일치 (5000원)-");
            case 4: System.out.print("4개 일치 (50000원)-");
            case 5: System.out.print("5개 일치 (1500000원)-");
            case 6: System.out.print("6개 일치 (2000000000원)-");
        }
        System.out.println(count+"개");
    }

    public void printMatchResult(){
        System.out.println("");
        System.out.println("당첨통계");
        System.out.println("--------");

        System.out.println("3개 일치 (5000원)-"+ match3 +"개");
        System.out.println("4개 일치 (50000원)-"+ match4 +"개");
        System.out.println("5개 일치 (1500000원)-"+ match5 +"개");
        System.out.println("6개 일치 (2000000000원)-"+ match6 +"개");
    }

    public void printProfitRate(int input){
        int revenue = sumRevenue();
        System.out.println("총 수익률은 "+ (revenue-input)/input*100 +"%입니다.");

    }

    private int sumRevenue(){
        return  5000 * match3 +
                50000 * match4 +
                1500000 * match5 +
                2000000000 * match6;
    }

    public void printLottoPurchase(int lottoNum){
        System.out.println( lottoNum + "개를 구매했습니다.");
        
    }

}
