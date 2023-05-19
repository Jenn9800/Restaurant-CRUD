package cn.techtutorial.model;

public class User {
	

	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private int height;
	private int weight;
	private int budget;
	private int cal_limit;
	
	
	
	public User() {
	}
	public User(String name, String email, String password, String gender, int height, int weight, int budget, int cal_limit) {
		super();
 		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.budget = budget;
		this.cal_limit = cal_limit;
	}
	
	public User(int id, String name, String email, String password, String gender,int height, int weight, int budget, int cal_limit) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.budget = budget;
		this.cal_limit = cal_limit;
	}
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getCal_limit() {
		return cal_limit;
	}

	public void setCal_limit(int cal_limit) {
		this.cal_limit = cal_limit;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", height=" + height + ", weight=" + weight + ", budget=" + budget + ", cal_limit="
				+ cal_limit + "]";
	}
	 
	
	
}