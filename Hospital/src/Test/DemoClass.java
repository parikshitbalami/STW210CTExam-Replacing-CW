package Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import hospital.ChangePassword;

public class DemoClass {
	public static void main(String [] args) {
		Result result =JUnitCore.runClasses(ChangePassword.class);
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result=="+result.wasSuccessful());
	}
}
