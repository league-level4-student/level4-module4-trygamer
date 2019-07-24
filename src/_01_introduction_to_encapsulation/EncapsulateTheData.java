package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */




public class EncapsulateTheData {

	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	int itemsReceived; //must not be negative. All negative arguments get set to 0.
	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public void setRecieved(int i) {
		if (i<0) {
			itemsReceived = 0;
			
		}
		else {
			itemsReceived = i;
			
		}
	}
		public int getRecieved() {
			
			
			return itemsReceived;
			
		}
		
		public void setT(float f) {
			if(f<=360.0&&f>=0.0) {
				degreesTurned= f;
				
			}
			
			
			
		}
		
		public float getT() {
			return degreesTurned;
			
		}
		
		public void setNC(String s) {
			if(s=="") {
				nomenclature =" ";
				
			}
			else {
				nomenclature= s;
				
			}
		}
		
		public String getNC() {
			return nomenclature;
			
		}
		
		public void setObj(Object o) {
			if(o.equals("")) {
				memberObj = new Object();
				
			}
			else {
				memberObj = o;
			}
			
		}
		
		public Object getObj() {
			return memberObj;
			
		}
		
	
	
	
	public static void main(String[] args) {
		
	}
}
