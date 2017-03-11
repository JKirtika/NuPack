import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJunit {
	PriceDetails pd = new PriceDetails();
	PriceCal pc = new PriceCal();
	
	//test to check the solution
	@Test
	
	public void testCalCost(){
		//1st case
		pd.setData("$1,299.99, 3 people, food");  
				
		double final_cost = pc.calCost(pd);
		System.out.println("Output: $"+final_cost);
	    assertEquals("Right Output", 1591.58, final_cost, 0.0);
   	    
        //2nd case
	    pd.setData("$5,432.00, 1 person, drugs"); 
	    
	    final_cost = pc.calCost(pd);
		System.out.println("Output: $"+final_cost);
	    assertEquals("Right Output", 6199.81, final_cost, 0.0);
    
        //3rd case
        pd.setData("$12,456.95, 4 people, books");
        
	    final_cost = pc.calCost(pd);
		System.out.println("Output: $"+final_cost);
	    assertEquals("Right Output", 13707.63, final_cost, 0.0);
	
	}
	
		
	}
	


