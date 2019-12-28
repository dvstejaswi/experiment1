
public class EmployeeUi {
    public static void main(String[] args)
    {
	  Employee[] store=new Employee[2];
	  store[0]=new Employee( 1, "a", 100);
	Manager m1=new Manager( 2, "b", 20);
	store[1]=m1;
	m1.addManagedEmployee(store[0]);
	EmployeeUi ui = new EmployeeUi();
	ui.print(store);
    
    }
	

 /* EmployeeMain em=new EmployeeMain();
	 em.print(store);*/
			

  
  
  
       public void print(Employee[] employee)
      {
	  for(Employee e : employee)
	  {
		  System.out.println(e.getName() + e.getBalance());
		  boolean isManager= e instanceof Manager;
		  if(isManager)
		  {
			  Manager m= (Manager) e;
			  System.out.println("Managed employees");
			  Employee[] managedEmployee = m.getManagedEmployes();
			  for(Employee managed : managedEmployee)
			  {
				  if (managed!=null)
					  System.out.println(managed.getName() + " "+ managed.getBalance());
			  }
		   }
	  }

}}