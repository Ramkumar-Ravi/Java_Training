package com.proxy;

public class Client {
	public static void main(String[] args) {
		Employee employee = new EmployeeProxy("Shiva");
		employee.work();
		employee.work();
	}
}