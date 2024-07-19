package inheritance1;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Pankaj");
		emp.setAge(23);

		System.out.println("1st Employee Details");
		System.out.println("Name : " + emp.getName());
		System.out.println("Age : " + emp.getAge());
		System.out.println();

		Employee emp1 = new Employee();
		emp1.setName("Samir");
		emp1.setAge(22);

		System.out.println("2nd Employee Details");
		System.out.println("Name : " + emp1.getName());
		System.out.println("Age : " + emp1.getAge());
		System.out.println();

		Manager man = new Manager();
		man.setName(emp.getName()); // man.getName can be taken but it will return null.
		man.setAge(emp.getAge());
		man.setRole("Testing");
		man.setSalary(1200000d);

		System.out.println("Manager Details");
		System.out.println("Name : " + man.getName());
		System.out.println("Age : " + man.getAge());
		System.out.println("Role : " + man.getRole());
		System.out.println("Salary : " + man.getSalary());
		System.out.println();

		Programmer pro = new Programmer();
		pro.setName(emp1.getName());
		pro.setAge(emp1.getAge());
		pro.setRole("Developer");
		pro.setSalary(900000d);

		System.out.println("Programmer Details");
		System.out.println("Name : " + pro.getName());
		System.out.println("Age : " + pro.getAge());
		System.out.println("Role : " + pro.getRole());
		System.out.println("Salary : " + pro.getSalary());

	}

}
