
public class StrategyPattern {


	public static void main(String[] args) {
		
		Human athlete = new Athlete();
		Human introvert = new Introvert();
		Human extrovert = new Extrovert();
		
		System.out.println("Athlete: ");
		athlete.Move();
		athlete.Sound();
		
		System.out.println("Introvert: ");
		introvert.Move();
		introvert.Sound();
		
		System.out.println("Extrovert: ");
		extrovert.Move();
		extrovert.Sound();
		

	}

}
