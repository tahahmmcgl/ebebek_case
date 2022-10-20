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

    // Eğer bonus ve tax totalSalary'e katılsaydı discord sunucusunda istenen değerler olmamış olacaktı.
    private double raiseSalary(){
        int year=(2021-hireYear);
        double totalSalary=(salary);
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
        double totalSalary=(salary-this.tax()+this.bonus()+this.raiseSalary());
        double totalSalaryWithTaxandBonus=salary-this.tax()+this.bonus();
        return  "Ad : " + name + '\n' +
                "Maaş : " + salary +'\n'+
                "Çalışma Saati : " + workHours +'\n'+
                "Başlangıç Yılı : " + hireYear +'\n'+
                "Vergi : "+ this.tax()+'\n'+
                "Bonus : "+ this.bonus()+'\n'+
                "Maaş Artışı : "+this.raiseSalary()+'\n'+
                "Vergi ve Bonuslar ile birlikte maaş : "+ totalSalaryWithTaxandBonus+'\n'+
                "Toplam Maaş : "+ totalSalary;
    }
}
