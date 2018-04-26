
public class Encapsulate {
	
	private String newName;
	private int newAge;
	
	
	public int getAge() {
		return newAge;
	}
	
	public String getName() {
		return newName;
	}
	
	public void setAge(int nowAge) {
		newAge = nowAge;
	}
	
	public void setName(String nowName) {
		newName = nowName;
	}
 
}
