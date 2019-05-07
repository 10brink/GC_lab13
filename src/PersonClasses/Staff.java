package PersonClasses;

public class Staff extends Person {
	private String school;
	private double pay;
	
	
	public Staff() {
		
		
		
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.setSchool(school);
		this.setPay(pay); 
		// TODO Auto-generated constructor stub
	}

	private String getSchool() {
		return school;
	}

	private void setSchool(String school) {
		this.school = school;
	}

	private double getPay() {
		return pay;
	}

	private void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff" + super.toString() +"[school=" + school + ", pay=" + pay + "]";
		
	}
	

}
