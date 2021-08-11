public abstract class Human {
	
	IMovePattern movePattern = new MoveWalking();
	ISoundPattern soundPattern = new SoundNormal();
	
	public void setMovePattern(IMovePattern movePattern) {
		
		this.movePattern = movePattern;
		
	}
	
	public void setSoundPattern (ISoundPattern soundPattern) {
		
		this.soundPattern = soundPattern;
		
	}
	
	public void Move() {
		
		movePattern.Move();
		
	}
	
	public void Sound() {
		
		soundPattern.Sound();
		
	}
}
