
public class Athlete extends Human{

	public Athlete() {
		
		setMovePattern(new MoveRunning());
		setSoundPattern(new SoundNormal());
		
	}
	
}
