package lotto;

import java.util.ArrayList;

public class Main {
    public static final int Cost = 1000;

    public static String getHello() {
        return "Hello";
    }
    public static void main(String[] args) {

        Input input = new Input();
        Service service = new Service();
        Output output = new Output();

        int purchaseAmount = input.inputPrice();
        int lottoNum = purchaseAmount/Cost;
        output.printLottoPurchase(lottoNum);

        ArrayList<ArrayList<Integer>> lottoNumbers = new ArrayList<>();

        for (int i=0; i<lottoNum; i++){
            lottoNumbers.add(service.createLottoNumbers());
        }

        ArrayList<Integer> winningNumber = input.inputLottoNumbers();

        for (ArrayList<Integer> lottoNumber:lottoNumbers){
            output.counting(service.countCorrectNumber(winningNumber,lottoNumber));
        }

        output.printMatchResult();
        output.printProfitRate(purchaseAmount);

    }
}
