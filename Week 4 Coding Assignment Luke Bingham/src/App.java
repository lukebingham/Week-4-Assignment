import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// Week 4 Coding Assignment Luke Bingham
		
		// ArrayList of String called employeeNames
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Clark Kent");
		employeeNames.add("Steve Rodgers");
		employeeNames.add("Bruce Wayne");
		employeeNames.add("Tony Stark");
		employeeNames.add("Bruce Banner");
		
		// HashMap of Integer, String called employeeMap
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		// HashSet of Integer called ids
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1001);
		ids.add(1002);
		ids.add(1003);
		ids.add(1004);
		ids.add(1005);
		
		int i = 0;
		
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
		}
		
		int x = 0;
		
		for (Integer employee : employeeMap.keySet()) {
			System.out.print(employee + "-" + employeeNames.get(x++) + " ");
		}
		
		// Print line created below to move down one line from previous print.
		
		System.out.println();
		
		// New String Builder called idsBuilder
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		
		System.out.print(idsBuilder.toString());
		
		// Print line created below to move down one line from previous print.
		
		System.out.println();
		
		// New String Builder called namesBuilder
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		System.out.println(namesBuilder.toString());

	}

}
