package introofjava;


public class EncapsulationDemo {


	String name;
	int age;
	int jersyNo;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}

	
	@Override
	public String toString() {
		return "EncapsulationDemo [name=" + name + ", age=" + age + ", jersyNo=" + jersyNo + "]";
	}
	
	
	
		
}
