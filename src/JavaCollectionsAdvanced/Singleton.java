package JavaCollectionsAdvanced;

public class Singleton {
	
	public static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
