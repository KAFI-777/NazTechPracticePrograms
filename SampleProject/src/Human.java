
public class Human extends Person implements Student {
	
	protected String feelings;
	protected String thought;
	protected String humanity;
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param gender
	 * @param address
	 * @param feelings
	 * @param thought
	 * @param humanity
	 */
	public Human(int id, String name, int age, String gender, String address, String feelings, String thought,
			String humanity) {
		super(id, name, age, gender, address);
		this.feelings = feelings;
		this.thought = thought;
		this.humanity = humanity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [feelings=" + feelings + ", thought=" + thought + ", humanity=" + humanity + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	public String study() {
		//System.out.println("Student = "+getName());
		return getName();
	}
	
	public void exam() {
		
	}

	
	
	

}
