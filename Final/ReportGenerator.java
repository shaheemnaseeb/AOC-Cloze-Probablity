package Final;

/**
 * ReportGenerator generates reports for different departments.
 * It uses a loop to iterate through the departments
 * and prints the report for each department
 * with the remaining days after each report.
 * 
 * AOC6 is used in this program
 */
public class ReportGenerator {

  /**
   * Generate reports for each department.
   * @param departments array of department names
   * @param initialDays the initial number of days available for reports
   * This method prints the report for each department
   */
  public static void generateReportsComma(String[] departments, int initialDays) {
        int daysRemaining = initialDays;
        for (int i = 0; i < departments.length;  ______ ) {
            System.out.printf(
                "Day %d: %s report (days left after this: %d)",
                i + 1,
                departments[i],
            ______ 
        }
    }

  public static void main(String[] args) {
    String[] departments = { "Sales", "Marketing", "HR", "IT" };
    generateReportsComma(departments, departments.length);
  }
}
