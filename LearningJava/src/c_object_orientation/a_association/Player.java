package c_object_orientation.a_association;

public class Player {
    private String name;
    // Association 1 to N
    // 1 Team have N Players
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if (this.team != null) {
            System.out.println(this.team.getName());
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
