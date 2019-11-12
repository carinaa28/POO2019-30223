
public class TestGhiozdan {

	public static void main(String[] args) {
		
		Ghiozdan G= new Ghiozdan(10);
		
		Caiet c1= new Caiet("mate");
		Caiet c2= new Caiet("fizica");
		Caiet c3= new Caiet("info");
	
		Manual m1= new Manual("desen");
		Manual m2= new Manual("fizica");
		Manual m3= new Manual("POO");
		
		G.addCaiet(c1);
		G.addCaiet(c2);
		G.addCaiet(c3);
		
		G.addManual(m1);
		G.addManual(m2);
		G.addManual(m3);
		
		System.out.println(G.getNrRechizite());
		System.out.println(G.getNrManuale());
		System.out.println(G.getNrCaiete());
		
		G.listItems();
		G.listCaiete();
		G.listManuals();
		
	}

}
