
public class Flamingo extends Bird{

	public Flamingo(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, migrates, avgFlightAltitude);
	}

	public Flamingo() {
		 maintenanceCost=0.9;
		 dangerPerc=1 ;
	}

}
