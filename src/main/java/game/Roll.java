package game;


public class Roll {

    private int knockedDown;

    public Roll(int knockedDown) throws Exception {
        this.validate(knockedDown);
        this.knockedDown = knockedDown;
    }

    private void validate(int pins) throws Exception {
        if (pins > 10) {
            throw new Exception("Can't roll more than 10");
        }
        if (pins < 0) {
            throw new Exception("Can't roll less than 0");
        }
    }

    public int getKnockedDown() {
        return knockedDown;
    }
}
