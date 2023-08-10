package Model;

public enum LottoNumberRules {

    MIN_LOTTO_NUMBER(1),
    MAX_LOTTO_NUMBER(45),
    LOTTO_NUMBER_COUNT(6);

    private final int ruleNum;

    LottoNumberRules(int ruleNum) {
        this.ruleNum = ruleNum;
    }

    public int ruleNum() {
        return ruleNum;
    }


}
