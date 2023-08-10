package View;

import java.util.*;

public class ScanLottoNumber {

    PrintToUser printToUser = new PrintToUser();
    Scanner scanner = new Scanner(System.in);

    //스캔받은 금액
    public int getUserPayment() {
        printToUser.askUserForPayment();
        return scanner.nextInt();
    }

    //스캔받은 보너스번호
    public int getBonusNumber() {
        printToUser.printAskBonusNumber();
        return scanner.nextInt();
    }

    //스캔받은 로또번호 리스트
    private List<Integer> scanLottoNumber() {
        printToUser.printAskLottoNumber();
        List<String> lottoNumberStr = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));
        List<Integer> lottoNumber = new ArrayList<>();;
        for(String oneLottoNumberStr : lottoNumberStr) {
            lottoNumber.add(Integer.parseInt(oneLottoNumberStr));
        }
        return lottoNumber;
    }
}
