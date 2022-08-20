package bll;

import dol.Club;
import dol.Employee;
import dol.Member;

public final class Application {
	
	public static Club socialClub;
	
	public static void addEmployee(Employee e) {
		socialClub.addEmployee(e);
	}
	
	public static void showEmployeesAsTable() {
		socialClub.showEmployeesAsTable();;
	}
	
	
	public static void addMember(Member m) {
		socialClub.addMember(m);
	}
	
	public static void showMembersAsTable() {
		socialClub.showMembersAsTable();
	}
}
