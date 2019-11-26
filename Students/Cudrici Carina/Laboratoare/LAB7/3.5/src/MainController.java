import java.awt.Color;

public class MainController {

	
	public static void main(String[] args) {

       
    
        Student p1 = new Student("Carina","Cudrici",new Masina("Chevrolet",Color.green));

       

        Student p2 = p1.deepCopy();
        p2.getMasina().revopseste(Color.blue);
        System.out.println("Person 1 : " + p1.getNume()  + " , " +p1.getMasina().getCuloare() );  
        System.out.println("Person 2 : " + p2.getNume() + " , " +p2.getMasina().getCuloare() +'\n'); 
        
        Student p3 = p1.shallowCopy();
        p3.setMasina(p1.getMasina().shallowCopy());
        p3.getMasina().revopseste(Color.red);
        System.out.println("Person 1 : " + p1.getNume()  + " , " +p1.getMasina().getCuloare()  );  
        System.out.println("Person 2 : " + p3.getNume() + " , " +p3.getMasina().getCuloare() ); 
        
    }

}
