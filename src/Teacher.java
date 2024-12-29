public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, String subject, int yearsOfExperience, int salary) {
        super(name, surname);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage>0){
            salary+=salary*percentage/100;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void giveRaise(int percent) {
        this.salary += this.salary * percent / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ", have " + yearsOfExperience +
                " years of experience, and earn a salary of " + salary + ".";
    }

}

