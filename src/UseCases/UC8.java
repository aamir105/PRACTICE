package UseCases;

public class UC8 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company, int empRatePerHrs, int noOfWorkingDays, int maxHoursPerMonth ) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkinDays = 0;

        while (totalEmpHrs <= maxHoursPerMonth && totalWorkinDays < noOfWorkingDays) {
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
        int totalEmpWage = totalEmpHrs * empRatePerHrs;
        System.out.println("Total Emp Wage for company: " + company + " is " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("Dmart",20,2,10);
        computeEmpWage("Relaince",10,4,20);
    }
}
