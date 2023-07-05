package c_object_orientation.a_association;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Vini Jr");
        Player player2 = new Player("Rodrygo");
        Player player3 = new Player("Courtois");

        Team team1 = new Team("Real Madrid");
        player1.setTeam(team1);
        player2.setTeam(team1);
        player3.setTeam(team1);

        player1.print();
    }
}
