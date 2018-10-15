package Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int niNumber, double salary, String deptName) {
        super(name, niNumber, salary, deptName);
        this.budget = 20000.00;
    }

    public double getBudget(){
        return budget;
    }

    public double payBonus(){ // changes salary to public?
        return (0.02 * salary);
    }
}
