public enum CardRank {
    ACE(11),
    KING(10),
    QUEEN(10),
    JACK(10),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2);

    private int blackJackValue;

    CardRank(int blackJackValue) {
        this.blackJackValue = blackJackValue;
    }

    public int getBlackJackValue() {
        return getBlackJackValue(false);
    }

    public int getBlackJackValue(boolean low){
        if(low){
            return this.blackJackValue - 10;
        }else{
            return this.blackJackValue;
        }
    }
}
