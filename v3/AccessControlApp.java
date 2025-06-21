package v3;

/**
 * AccessControlApp determines a user’s access level:
 *
 *  - If the user is logged in
 *       • and is an admin → accessLevel = 2
 *       • otherwise           → accessLevel = 1
 *  - (Guests remain at accessLevel = 0)
 * 
 * AOC3 is used in this program
 */
public class AccessControlApp {
    public static void main(String[] args) {
        ______ isLoggedIn = true;  
        boolean ______ = false;
        int accessLevel = 0;

        if (isLoggedIn)
            if (isAdmin)
                accessLevel = 2;  
        ______                     
        ______      

        System.out.println("Computed access level: " + accessLevel);

        // Validation: for (true, false) we expect 1
        if (accessLevel == 1) {
            System.out.println("✔ Access level is correct.");
        } else {
            System.err.println("✘ Wrong access level: " + accessLevel);
        }
    }
}
