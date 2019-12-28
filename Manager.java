
public class Manager extends Employee {
	int i=0;
	private Employee managedEmployees[]= new Employee[6];
	public Employee[] getManagedEmployes() {
		return managedEmployees;
	}
	public Manager(int id, String name, double balance)
	{	super(id, name, balance);
    }

	public void addManagedEmployee(Employee e) {
		managedEmployees[i]=e;
		i++;
		}
}
