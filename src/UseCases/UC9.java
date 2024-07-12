package UseCases;

class EmpWageBuilderObject {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHrs;
    private final int noOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmpWageBuilderObject(String company, int empRatePerHrs, int noOfWorkingDays, int maxHoursPerMonth ) {
        this.company = company;
        this.empRatePerHrs = empRatePerHrs;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void compteEmpWage(){
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
        totalEmpWage = totalEmpHrs * empRatePerHrs;
    }

    @Override
    public String toString() {
        return "Total EmpWage for a company: "+" is"+totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageBuilderObject dmart = new EmpWageBuilderObject("Dmart",20,2,10);
        EmpWageBuilderObject reliance = new EmpWageBuilderObject("Relaince",10,4,20);
        dmart.compteEmpWage();
        System.out.println(dmart);
        reliance.compteEmpWage();
        System.out.println(reliance);
    }
}
