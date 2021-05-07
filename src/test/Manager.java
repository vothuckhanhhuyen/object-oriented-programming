package test;

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	Employee assistant = new Employee();

	public Employee getAssistant() {
		return assistant;
	}

	public void setAssistant(Employee assistant) {
		this.assistant = assistant;
	}
	
}
