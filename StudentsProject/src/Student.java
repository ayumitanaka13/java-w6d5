
public class Student {
	private int id;
	private String email;
	private String fullName;
	
	//constructor
	
	public Student(int id, String email, String fullName) {
		setId(id);
		setEmail(email);
		setFullName(fullName);
	}
	
	//getter
	
	/*
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/*
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * @return fullName
	 */
	public String getFullName() {
		return fullName;
	}

	
	
	//setter
	
	/*
	 * @param id
	 */
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		} else {
			this.id = 1;
		}
	}
	/*
	 * @param email
	 */
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "Unknown";
		}
	}
	/*
	 * @param fullName
	 */
	public void setFullName(String fullName) {
		if (!fullName.isEmpty() && !fullName.equalsIgnoreCase(null)) {
			this.fullName = fullName;
		} else {
			this.fullName = "Unknown";
		}
	}
	
	@Override
	public String toString() {
		return  "\nStudent id: " + id +  
				"\nEmail: " + email + 
				"\nFull Name: " + fullName;
	}
}