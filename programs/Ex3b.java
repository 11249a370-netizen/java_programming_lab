import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int runs;

    Player(String n, int r) {
        name = n;
        runs = r;
    }

    public int compareTo(Player p) {
        return p.runs - runs; // Sort from highest to lowest
    }

    public String toString() {
        return name + "(" + runs + ")";
    }
}

public class SortDemo {
    public static void main(String[] args) {
        Player[] p = {
            new Player("Rajeswari", 45),
            new Player("Anisha", 92),
            new Player("Kamakshi", 67)
        };

        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}
