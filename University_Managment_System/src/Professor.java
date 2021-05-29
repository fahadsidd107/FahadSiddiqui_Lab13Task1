public class Professor extends Faculty{
	public static void main(String[] args) {
		System.out.println("\n Faculty class methods \n");
		Faculty fac = new Faculty();
		fac.Salary();
		fac.Designation();
		
		System.out.println("\n Admin class methods \n");
		Admin adm = new Admin();
		adm.Salary();
		adm.Designation();
		
		System.out.println("\n Classess Methods are Started....! \n");
		
		Assistant_Professor a  =  new Assistant_Professor();
		a.msg();
		
		Lecturer b  =  new Lecturer();
		b.msg();

		Examination c =  new Examination();
		c.msg();
	
		Admission_Classes d  =  new Admission_Classes();
		d.msg();
	}
//Changes in Professor.java as ading few comments
//Muhammad Fahad Siddiqui
// 2019-SE-206

}
