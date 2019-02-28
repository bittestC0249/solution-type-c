package problem04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		while(sc.hasNext()) {
			String line = sc.next();
			String[] arr = line.split(",");
			if(validateCheck(arr)) {
				
			}
			for(String target : arr) {
				list.add(target);
			}
		}
		
		
	}

	private static boolean validateCheck(String[] arr) {
		String[] item = arr[0].split("x");
		return false;
	}
		
}
