import game.Game;
import game.Player;

public class Application {

    public static void main(String[] args) throws Exception {
        // pseudo kodas
        Game game = new Game(); // cia visas zaidimas (tie 10 metimu..jeigu daugiau zaidej

        game.register(new Player("Motiejus"));
        game.register(new Player("Giedrius"));

        Player currentPlayer = game.start(); // player uzstato motieju kaip pirma
        currentPlayer.roll(5);
        currentPlayer.roll(5);

        currentPlayer = game.nextPlayer(); // player uzstato giedriu.
        // motiejus.roll(10); // / META EXCEPTION, metei jau dukart, leisk draugui. (cia jeigu nebutu nextPlayer();

        currentPlayer.roll(3);
        currentPlayer.roll(6);

        game.finish();
        for (Player player : game.getPlayers()) {
            System.out.println(player.toString());
        }
    }
}
