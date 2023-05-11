package b_object_orientation.a_association;

public class PlayerTest2 {
    public static void main(String[] args) {
        Player player = new Player("Neymar");
        Player player2 = new Player("Messi");
        Team team = new Team("PSG");
        Player[] players = {player,player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("--- Player ---");
        player.print();

        System.out.println("--- Team ---");
        team.print();

    }
}
