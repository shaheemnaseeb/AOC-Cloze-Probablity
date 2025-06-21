package v3;

/**
 * AccessEvaluator checks whether users can access the system:
 *
 *   • A user may access if they are active AND have the “USER” role,
 *     OR if they have the “ADMIN” role (regardless of active status).
 *
 * We’ll test on three users:
 *   - Alice: active + user → should get access
 *   - Bob:   inactive + admin → should get access (tests the OR branch)
 *   - Carol: active + no roles → no access
 * 
 * AOC4 is used in this program
 */
public class AccessApp {
    static class User {
        String name;
        ______ active;
        boolean hasUserRole;
        boolean hasAdminRole;
        User(String n, ______ a, boolean u, boolean ad) {
            name = n; active = a; hasUserRole = u; ______ = ad;
        }
    }

    public static boolean hasAccess(User u) {
        return _____
    }

    public static void main(String[] args) {
        ______[] users = {
            new User("Alice", true,  true,  false),
            new ______("Bob",   false, false, true),
            new User("Carol", true,  false, false)
        };

        for (User u : ______) {
            boolean can = hasAccess(u);
            System.out.printf("%s: access=%b%n", u.name, can);
        }

        // Validation check
        boolean ok = 
            hasAccess(users[0]) &&   // Alice → true
            ______(users[1]) &&   // Bob   → true
           !hasAccess(users[2]);     // Carol → false

        if (ok) {
            System.out.println("All OK – logic implemented correctly.");
        } else {
            System.err.println("Error – logic is broken!");
        }
    }
}