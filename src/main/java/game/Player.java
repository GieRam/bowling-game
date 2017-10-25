package game;


public class Player {

    private String name;

    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // access modifier, return type, function name, function arguments list, throws or doesnt throw exception,
    // { function body }
    public void roll(int pins) throws Exception {
        Roll roll = new Roll(pins);
        score += roll.getKnockedDown();
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return this.name + " scored: " + this.score;
    }
}
