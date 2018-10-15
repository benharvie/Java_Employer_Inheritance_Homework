package Staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    public double salary;

    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String setName(String newName){
        if(newName != null){
            name = newName;
        }
        return name;
    }

    public int getNiNumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double raiseAmount){
        if(raiseAmount > 0){
            salary += raiseAmount;
        }
    }

    public double payBonus(){
        return (0.01 * salary);
    }
}
