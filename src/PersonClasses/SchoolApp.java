package PersonClasses;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person a = new Person("nick", "ann arbor");

		System.out.println(a);

		Student b = new Student("bob", "detroit", "CS", 2020, 20000);

		System.out.println(b);

		Staff c = new Staff("sally", "grand rapids", "GVSU", 500000);
		System.out.println(c);

		Person linmei = new Student("Linmei", "main st", "java", 2019, 0);
		System.out.println(linmei);

		Student updatedlinmei = (Student) linmei;
		updatedlinmei.setFee(5000);

		System.out.println(updatedlinmei);

		// linmei.setAddress("");
	}

}
