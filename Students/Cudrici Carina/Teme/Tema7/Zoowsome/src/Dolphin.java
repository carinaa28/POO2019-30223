
public class Dolphin extends Aquatic {

	public Dolphin(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			Integer avgSwimDepth, Type waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, avgSwimDepth, waterType);
	
	}

	public Dolphin() {
	 maintenanceCost=0.9;
	 dangerPerc=15 ;
	}

}
