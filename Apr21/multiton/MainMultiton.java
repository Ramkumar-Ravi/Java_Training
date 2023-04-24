package multiton;

public class MainMultiton {

	public static void main(String[] args) {
		EmployeeMultiton employee1 = EmployeeMultiton.getInstance("1", "John", 12345);
		EmployeeMultiton employee2 = EmployeeMultiton.getInstance("2", "James", 54321);
		EmployeeMultiton employee3 = EmployeeMultiton.getInstance("1", "Julie", 67890);

		employee1.displayInfo(); // output: Name: John, ID: 12345
		employee2.displayInfo(); // output: Name: James, ID: 54321
		employee3.displayInfo(); // output: Name: Julie, ID: 12345
	}

}
