package View;

public enum PrizeMoney {

    THREE_PRIZE(3, 5000),
    FOUR_PRIZE(4, 50000),
    FIVE_PRIZE(5, 1500000),
    FIVE_BONUS_PRIZE(5, 30000000),
    SIX_PRIZE(6, 2000000000);

    private final int matchingCount;
    private final int prize;

    PrizeMoney(int matchingCount, int prize) {
        this.matchingCount = matchingCount;
        this.prize = prize;
    }

    public int matchingCount() {
        return matchingCount;
    }

    public int prize() {
        return prize;
    }
}
