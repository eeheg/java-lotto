package Model;

import java.util.*;

public class Calculator {
    private final static int LOTTO_PRICE = 1000;

    //구매한 로또 개수
    public int getPurchasedLottoCount(int userPayment) {
        System.out.println(userPayment/LOTTO_PRICE);
        return userPayment/LOTTO_PRICE;
    }

    //모든 로또티켓 List
    public List<LottoTicket> getAllLottoTickets(int PurchaseLottoCount) {
        List<LottoTicket> AllLottoTicket = new ArrayList<>();
        for (int i=0; i<PurchaseLottoCount; i++) {
            AllLottoTicket.add(new LottoTicket());
        }
        return AllLottoTicket;
    }



}
