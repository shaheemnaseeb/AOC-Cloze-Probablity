package Final;

/**
 * A small app that “registers” three users and then
 * prints their details.
 * 
 * AOC1 is used in this program
 */
public class UserApp {
    private static int lastId = 1000;

    /**
     * Get the next user ID.
     * This method increments the lastId and returns it.
     * @return the next user ID
     */
    public static int getNextId() {
        return ______
    }

    static class User {
        final int id;
        final String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Register three users
        User[] team = {
                new User(getNextId(), "Alice"),
                new User(getNextId(), "Bob"),
                new User(getNextId(), "Charlie")
        };

        int count = 0;
        while (count < team.length) {
            System.out.printf("User %d: %s (ID=%d)%n", count + 1, team[count].name, team[count].id);
            count++;
        }

        // Final sanity check
        if (team[0].id == 1001
                && team[1].id == 1002
                && team[2].id == 1003
                && count == 3) {
            System.out.println(">>> All users registered & printed correctly!");
        } else {
            System.err.println(">>> ERROR: user registration or printing failed!");
        }
    }
}
