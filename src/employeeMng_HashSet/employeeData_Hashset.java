package employeeMng_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import HashMap_employee.employee_Hashmap;

public class employeeData_Hashset {

	public static void main(String[] args) {
		
		Set<employee_Hashset> set=new HashSet<employee_Hashset>();
		set.add(addEmployeeData1(2));
		set.add(addEmployeeData1(2));
		//employee_Hashset e1=getEmployeeData(set, 1);
		System.out.println(set.size());
		//System.out.println(e1.getEmployeeID());
		employee_Hashset e1=getEmployeeData(set,2);
		System.out.println(e1.toString());
	}
		
		/*Map<Integer, employee_Hashset> dataMap = new HashMap<>();
		employee_Hashset a1 = addEmployeeData1(2);
		dataMap.put(a1.getEmployeeID(), a1);
		
		dataMap.get(2);*/


		
	public static employee_Hashset addEmployeeData(){
		
		employee_Hashset e1=new employee_Hashset();
		e1.setEmployeeID(1);
		e1.setEmployee_designation("Tester");
		e1.setEmployee_Name("Kyur");
		return e1;
	}
	
	public static employee_Hashset addEmployeeData1(Integer id){
		
		employee_Hashset e1=new employee_Hashset();
		e1.setEmployeeID(id);
		e1.setEmployee_designation("Tester");
		e1.setEmployee_Name("Kyur");
		return e1;
	}
	
	public static employee_Hashset getEmployeeData(Set<employee_Hashset> set, int ID ){
		Iterator<employee_Hashset> itr = set.iterator();
		employee_Hashset x = null ;
			while(itr.hasNext()){
				x = itr.next();
				if(Objects.equals(x.getEmployeeID(), ID)){
					
				}
			}
			//System.out.println(emp.toString());
			//emp.getEmployeeID();
		
			return x;
}


	
}
