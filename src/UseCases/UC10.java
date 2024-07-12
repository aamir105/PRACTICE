package UseCases;

class CompanyEmpWage {
    public final String company;
    public final int empRatePerHrs;
    public final int noOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
        empWageBuilder.addCompanyEmpWage("relaince",10,4,20);
    }

    public CompanyEmpWage(String company, int empRatePerHrs, int noOfWorkingDays, int maxHoursPerMonth ) {
        this.company = company;
        this.empRatePerHrs = empRatePerHrs;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString(){
        return "Total Employee Wage for the company: "+company+" is"+totalEmpWage;
    }
}

class EmpWageBuilderArray{
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOFCompany = 0;
    private CompanyEmpWage [] companyEmpWageArray;

    public EmpWageBuilderArray(){
        companyEmpWageArray =new CompanyEmpWage[5];
    }

    public void addCompanyEmpWage(String company,int empRatePerHrs,int noOfWorkingDays,int maxHoursPerMonth){
        companyEmpWageArray[numOFCompany] = new CompanyEmpWage(company,empRatePerHrs,noOfWorkingDays,maxHoursPerMonth);
        numOFCompany++;
    }

    private void computeEmpWage(){
        for (int i = 0; i<numOFCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage){
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.noOfWorkingDays) {
            totalWorkingDays++;
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
            System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHrs;
    }


}

