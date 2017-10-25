package game;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PlayerTest {

    @Test
    public void rollAddsToScore() throws Exception {
        Player player = new Player("Test");
        player.roll(8);

        Assert.assertThat(player.getScore(), is(8));
    }

    @Test
    public void twoRollsAddToScore() throws Exception {
        Player player = new Player("Test");
        player.roll(8);
        player.roll(5);

        Assert.assertThat(player.getScore(), is(13));
    }

    @Test
    public void threeRollsAddToScore() throws Exception {
        Player player = new Player("Test");
        player.roll(8);
        player.roll(5);
        player.roll(3);

        Assert.assertThat(player.getScore(), is(16));
    }

    @Test(expected = Exception.class)
    public void cantRollAboveTen() throws Exception {
        Player Player = new Player("Test");
        Player.roll(11);
    }

    @Test(expected = Exception.class)
    public void cantRollNegative() throws Exception {
        Player Player = new Player("Test");
        Player.roll(-1);
    }
}
