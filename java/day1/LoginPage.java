//Home Assignment <2B>: Demonstrating Method Overriding in Java

package week4.day1;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {
		System.out.println("Login page common tasks");
		super.performCommonTasks();
	}

	public static void main(String[] args) {

		LoginPage performCommonTasksObj = new LoginPage();
		performCommonTasksObj.performCommonTasks();

		// BasePage performCommonTasksObj2 = new BasePage();
		// performCommonTasksObj2.performCommonTasks();
	}

}
