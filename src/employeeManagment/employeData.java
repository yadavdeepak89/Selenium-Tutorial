package employeeManagment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class employeData {

	public static void main(String[] args) {
		List<employee> list=new ArrayList<employee>();
		//employee e=new employee(1,"Tstuser", "dev");
		//list.add(e);
		list.add(addData());
		list.add(addData());
	
		System.out.println(list.size());
		employee e1 = getEmployeeByDesigation(list, "developer");
		if(e1 != null) {
			System.out.println(e1.toString());
		}
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			if(list.get(i).equals("dev")){
				System.out.println(list.get(i));
			}
		}*/
		
		//getData(list, "dev");
	}
	
	public static employee addData(){
		employee e = new employee();
		Random rand = new Random();
		
		e.setEmployeeId(rand.nextInt(50) + 1);
		e.setEmployeeName("Testuser");
		e.setDesignation("Developer");
		
		return e;	
	}
	
	public static employee getEmployeeByDesigation(List<employee> list,  String designation) {
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
			if(list.get(i)
					.getDesignation().equalsIgnoreCase(designation)) {
				return list.get(i);
			}
		}
		return null;
	}
}
