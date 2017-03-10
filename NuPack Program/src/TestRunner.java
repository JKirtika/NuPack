import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public static void main(String args[]){
		
		Result r = JUnitCore.runClasses(TestJunit.class); 
		
		for(Failure f : r.getFailures()){
			System.out.println(f.toString()); // print failure message along with its value
		}
		
		System.out.println(r.wasSuccessful()); // return true if its matched
	}

}
