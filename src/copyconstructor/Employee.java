package copyconstructor;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public Employee(Employee emp) {
		this.id=emp.id;
		this.name=emp.name;
		
		Address dummyAdd=new Address();
		dummyAdd.city=emp.address.city;
		dummyAdd.country=emp.address.country;
		dummyAdd.pin=emp.address.pin;
		this.address=dummyAdd;
		
		}
	
	
	@Override
	public String toString() {
	return "Employee[id="+id+",name="+name+",address="+address+"]";

		}
		
	}

