package Final;

/**
 * AccessEvaluator checks whether users can access the system:
 *
 * • A user may access if they are active AND have the “USER” role,
 * OR if they have the “ADMIN” role (regardless of active status).
 *
 * We’ll test on three users:
 * - Alice: active + user → should get access
 * - Bob: inactive + admin → should get access (tests the OR branch)
 * - Carol: active + no roles → no access
 * 
 * AOC4 is used in this program
 */
public class AccessApp {
    static class User {
        String name;
        ______ active;
        boolean hasUserRole;
        boolean hasAdminRole;

        User(String name, boolean ______, boolean hasUserRole, boolean hasAdminRole) {
            this.name = name;
            this.active = active;
            ______.hasUserRole = hasUserRole;
            this.hasAdminRole = ______;
        }
    }

    public static boolean hasAccess(User user) {
        return _____
    }

    public static void main(String[] args) {
        ______[] users = {
                new User("Alice", true, true, false),
                new ______("Bob", false, false, true),
                new User("Carol", true, false, false)
        };

        for (User user : ______) {
            boolean can = hasAccess(user);
            System.out.printf("%s: access=%b%n", user.name, can);
        }

        // Validation check
        boolean ok = hasAccess(users[0]) && // Alice → true
                ______(users[1]) && // Bob → true
                !hasAccess(users[2]); // Carol → false

        if (ok) {
            System.out.println("All OK – logic implemented correctly.");
        } else {
            System.err.println("Error – logic is broken!");
        }
    }
}
