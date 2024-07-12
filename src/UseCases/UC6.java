package UseCases;

public class UC6 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTHS = 10;

    public static void main(String[] args) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkinDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTHS && totalWorkinDays < NUM_OF_WORKING_DAYS) {
            totalWorkinDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkinDays + " Emp Hrs: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HRS;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}


