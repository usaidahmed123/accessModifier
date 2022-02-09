package pack;
public class Access_Modifier{
	int nos;
	float hrs;
	int noc;
	void displayStudents() {//m1
		System.out.println("Number of Students");
	}
	void displayHours() {//m2
		System.out.println("Number of Hours");
	}
	void displayClass() {//m3
		System.out.println("Number of Class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Modifier am = new Access_Modifier();
		am.displayStudents();
	}
}

