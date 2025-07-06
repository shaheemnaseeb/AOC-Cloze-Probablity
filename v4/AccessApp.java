package v4;

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

public class AccessApp {
    static class User {
        String name;
        boolean isActive;
        boolean hasUserRole;
        boolean hasAdminRole;

        User(String name, boolean isActive, boolean hasUserRole, boolean hasAdminRole) {
            this.name = name;
            this.isActive = isActive;
            this.hasUserRole = hasUserRole;
            this.hasAdminRole = hasAdminRole;
        }

        public boolean hasAccess() {
            return (this.hasAdminRole || hasUserRole && isActive);
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Alice", true, true, false); // User active
        User user2 = new User("Bob", true, false, true); // admin avtive
        User user3 = new User("Carol", false, true, false); // User inactive
        User user4 = new User("David", false, false, true); // Admin inactive
        User user5 = new User("Jack", true, false, false); // No role

        System.out.println(user1.hasAccess()); // true
        System.out.println(user2.hasAccess()); // true
        System.out.println(user3.hasAccess()); // false
        System.out.println(user4.hasAccess()); // false
        System.out.println(user5.hasAccess()); // false

        /*
         * ------------------------------
         * Alternative to above
         */

        boolean hasAccessUser1 = user1.hasAccess();
        boolean hasAccessUser2 = user2.hasAccess();
        boolean hasAccessUser3 = user3.hasAccess();
        boolean hasAccessUser4 = user4.hasAccess();
        boolean hasAccessUser5 = user5.hasAccess();

        if (hasAccessUser1 && hasAccessUser2 && !hasAccessUser3 && !hasAccessUser4 && !hasAccessUser5) {
            System.out.println("You wrote the right Code");
        }
    }
}