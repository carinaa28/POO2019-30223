import java.math.BigDecimal;

public class Caretaker extends Employee implements Caretaker_I{
	protected Double workingHours;


	public Caretaker(String name, Long id, BigDecimal salary, Double workingHours) {
		super(name, id, salary);
		this.workingHours = workingHours;
	}


	public Caretaker() {
		super();
		
	}


	public Double getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal animal) {
		
		if(animal.kill() ) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		workingHours-=animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
		
		}
		
}
