public abstract class Animal implements Killer {
	protected Integer nrOfLegs;
	protected String name;
	protected  double maintenanceCost;
	protected  double dangerPerc ;
	protected boolean takenCareOf = false;
	
	

	public Animal(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf) {
	    this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = takenCareOf;
	}

	public Animal() {
		this.maintenanceCost = 0;
		this.dangerPerc =0;
		
	}

	public static void main(String[] args) {

	}

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public boolean kill()
	{
		double r= Math.random();
		if(r < dangerPerc ) return  true;
		return false;
	}

}
