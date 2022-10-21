package arrayList_practice;

public class Emp {
	private int id;
	private String name;
	private int salary;
	
	public Emp(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Emp() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name=name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
