package test240718.object1;

public class PersonController {
	
	Person[] p = new Person[20];
	
//	private Student[] s = new Student[3]; // 
//	private Employee[] e = new Employee[10];	//	n,n,n,n,n,n,n,n,n,n
//	
	
	//학생객체 수를 int[0]에
	//근로자객체 수를 int[1]에 넣어서 반환
	public int[] personCount() {
		int[] countArr = new int[2];
		
		int studentCount = 0, employeeCount = 0;
		for(Person tmp : p) {
			if(tmp == null) {
				break;
			}else if (tmp instanceof Student) {
				studentCount++;
			}else if (tmp instanceof Employee) {
				employeeCount++;
			}
			
		}
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
		
	}
	
	
	public void insetrPerson(Person per) {
		for(int i=0; i<p.length; i++) {
			if(p[i] == null) {
				p[i] = per;
				return;
			}
		}
	}
	
	
	
	public Person[] printPerson() {
		return this.p;
	}

}
