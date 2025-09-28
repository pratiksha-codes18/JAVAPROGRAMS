package Assignment3;
import java.util.*;
public class HashTable {
	public static void main(String[] args) {
	        Hashtable<String, Integer> empTable = new Hashtable<>();

	        // add some employees
	        empTable.put("Pakhi", 50000);
	        empTable.put("Rakhi", 60000);
	        empTable.put("Sakhi", 45000);
	        empTable.put("Sona", 70000);

	        // display all employees (simple way)
	        System.out.println("Employee Details:");
	        for (String name : empTable.keySet()) {
	            System.out.println("Name: " + name + ", Salary: " + empTable.get(name));
	        }

	        // search employee
	        String searchName = "Raj";
	        if (empTable.containsKey(searchName)) {
	            System.out.println("\nSalary of " + searchName + " is: " + empTable.get(searchName));
	        } else {
	            System.out.println("\nEmployee " + searchName + " not found.");
	        }
	    }
	}



