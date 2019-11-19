
public class Butterfly  extends Insect{

	public Butterfly(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, canFly, isDangerous);
	
	}

	public Butterfly() {
		maintenanceCost=0.5;
		 dangerPerc=0 ;
	}

}
