package v3;

/**
 * A small app that “registers” three users and then
 * prints their details.
 * 
 * AOC1 is used in this program
 */
public class UserApp {
    private static int lastId = 1000;

    public static int getNextId() {
        return ______
    }

    static class User {
        final ______ id; 
        final String name;
        ______(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Register three users
        User[] team = {
            new User(getNextId(), "Alice"),
            new User(______, "Bob"),
            new User(getNextId(), "Charlie")
        };

        int count = 0;
        while (count < ______)
            System.out.printf("User %d: %s (ID=%d)%n", count+1, team[count].name, team[count].id);
            ______

        // Final sanity check
        if (team[0].id == 1001
         && team[1].id == 1002
         && team[2].id == 1003
         && ______ == 3) {
            System.out.println(">>> All users registered & printed correctly!");
        } else {
            System.err.println(">>> ERROR: user registration or printing failed!");
        }
    }
}
