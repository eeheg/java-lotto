package View;

import java.text.DecimalFormat;
import java.util.List;

class PrintToUser {
    DecimalFormat prizeToPrint = new DecimalFormat("###,###");

    void askUserForPayment() {
        System.out.println("구입금액을 입력해 주세요.");
    }
    void printPurchaseLottoCount(int purchasedLottoCount) {
        System.out.printf("%d개를 구매했습니다.\n\n", purchasedLottoCount);
    }

    void printAllLottoTickets(List<Integer> lottoTicketNumber) {
        System.out.println();
    }

    void printAskLottoNumber() {
        System.out.println("쉼표(,)로 구분하여 6자리의 로또번호를 입력해주세요.");
    }
    void printAskBonusNumber() {
        System.out.println("보너스 번호를 입력해주세요.");
    }
    void printStatisticIntro() {
        System.out.println("당첨 통계\n---\n");
    }
    void printWinningStatistic(int matchingCount, int prize, int matchingTicket) {
        System.out.printf("%d개 일치 (%s원) - %d개\n", matchingCount, prizeToPrint.format(prize), matchingTicket);
    }
    void printRateOfReturn(double rateOfReturn) {
        System.out.println("총 수익률은 " + rateOfReturn + "%입니다.");
    }

}
