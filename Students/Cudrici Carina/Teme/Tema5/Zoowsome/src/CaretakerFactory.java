public class CaretakerFactory extends EmployeeFactory {

	@Override
	public Employee getEmployee(String type) throws Exception {
		
		if (Constants.Employees.Caretaker.equals(type)) {
			return new Caretaker();}
		
		 else 
			throw new Exception("Invalid employee exception!");
		
	}

}