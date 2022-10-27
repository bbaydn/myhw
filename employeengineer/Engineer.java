package employeengineer
	private String project;

	public Engineer(int number, String name, int year, String department, String forecast) {
		super(number, name, year, department);
		this.forecast = forecast;
	}
	
	public void work(){
		System.out.println("Engineer is working on a forecast: " + forecast);
	}
	
	public void assignTask(String task){
		System.out.println("Engineer " + name + " works on the task: " + task);
	}
}
