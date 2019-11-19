public class Insect extends Animal{
	boolean canFly;
	boolean isDangerous;

	
	public Insect(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Insect() {
		maintenanceCost=0;
		 dangerPerc=0 ;
	}
	

}
