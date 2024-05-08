package JavaCollectionsAdvanced;

public class FinalizeBlock {

	@Override
	public void finalize() {
		System.out.println("into finalize method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeBlock obj = new FinalizeBlock();
		obj = null;
		System.gc();
		System.out.println("end");

	}

}
