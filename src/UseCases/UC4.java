package UseCases;

public class UC4 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int empCheck= (int) Math.floor(Math.random()*10)%3;
        switch (empCheck){
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HRS;
        System.out.println("Employee Wage: "+ empWage);

    }
}