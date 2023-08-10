package Model;

import java.util.*;

public class LottoTicket {

    List<Integer> lottoTicketNumber;

    //로또티켓 1장 생성자
    LottoTicket() {
        this.lottoTicketNumber = getLottoTicketNumber();
    }

    //로또티켓 1장 만들기
    public List<Integer> getLottoTicketNumber() {
        while (!hasSixNumber()) {
            int oneRandomNumber = makeOneRandomNumber();
            if (!lottoTicketNumber.contains(oneRandomNumber)) {
                lottoTicketNumber.add(oneRandomNumber);
            }
        }
        return lottoTicketNumber;
    }

    //1~45 랜덤숫자 추출기
    private int makeOneRandomNumber() {
        LottoNumberRules max = LottoNumberRules.MAX_LOTTO_NUMBER;
        LottoNumberRules min = LottoNumberRules.MIN_LOTTO_NUMBER;
        return (int)(Math.random() * (max.ruleNum()-min.ruleNum()) + min.ruleNum());
    }

    //6자리의 숫자를 가졌는지 확인하는 boolean
    private boolean hasSixNumber() {
        LottoNumberRules count = LottoNumberRules.LOTTO_NUMBER_COUNT;
        return lottoTicketNumber.size() == count.ruleNum();
    };

}
