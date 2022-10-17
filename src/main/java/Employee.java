public class Employee {

    private String name;
    private double salary;
    private int workHours,hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.hireYear=hireYear;
        this.workHours=workHours;
    }
    private double tax(){
        double tax=0;
        if (this.salary>=1000){
            tax=this.salary*0.03;
        }
        return tax;
    }
    private double bonus(){
        double bonus=0;
        if(this.workHours>=40){
            bonus=(this.workHours-40)*30;
        }
        return bonus;
    }

    private double raiseSalary(){
        int year=2021-this.hireYear;
        double totalSalary=(this.salary-this.tax()+this.bonus());
        if (year<10){
            return totalSalary*0.05;
        } else if (year>=10 && year<20) {
            return totalSalary*0.1;
        }else {
            return totalSalary*0.15;
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + this.tax() +
                ", bonus=" + this.bonus() +
                ", raiseSalary=" +this.raiseSalary() +
                ", totalSalary=" + (this.bonus()+salary) +
                ", totalSalaryWithTax=" +(this.bonus()-this.tax()+salary) +
                '}';
    }
}
