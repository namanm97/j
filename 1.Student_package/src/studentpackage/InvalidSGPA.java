package studentpackage;

public class InvalidSGPA extends Exception {
	private static final long serialVersionUID = 1L;
	String s1;
	public InvalidSGPA(String s2) {
		s1 = s2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s1;
	}
	
}
