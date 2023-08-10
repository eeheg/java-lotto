package Controller;

import View.*;
import Model.*;

import java.util.List;

public class Controller {
    ScanLottoNumber scanLottoNumber = new ScanLottoNumber();
    Calculator calculator = new Calculator();

    int userPayment = scanLottoNumber.getUserPayment(); //처음부터 오류;ㅜㅜㅜㅜ씨배래애애ㅐㅇㄹ
    int purchasedLottoCount = calculator.getPurchasedLottoCount(userPayment);

    List<LottoTicket> allLottoTickets = calculator.getAllLottoTickets(purchasedLottoCount);

    public void print() {
        System.out.println(allLottoTickets);
    }

}
