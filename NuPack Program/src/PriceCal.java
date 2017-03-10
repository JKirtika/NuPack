//created by Kirtika Aggarwal, 10-March-2017, version -1
public class PriceCal {
	
		static public double calCost(PriceDetails pd){
		
		
		double final_cost=0.0d;
		
		String data = pd.getData();
		System.out.println("Input: "+data);
		
		String dataArray[] = data.trim().split("\\s*, \\s*"); // extracting data
		
		String price = dataArray[0].replace("$","").replace(",", ""); //removing dollar sign and commas from the price
        String person[] = dataArray[1].trim().split(""); //extracting only  digit 
	    String material = dataArray[2];
		
	    double base_price = Double.parseDouble(price);
	    int person_no = Integer.parseInt(person[0]);
		
	    base_price = base_price*0.05+base_price; //  flat markup on all jobs of 5%
		double person_val = base_price*0.012*person_no; // markup of 1.2% on each person
		double material_val = 0.0d;
		
		if(material.equalsIgnoreCase("drugs")){
			 
			 material_val = base_price*0.075;    
			 
		 }else if(material.equalsIgnoreCase("food")){
			
			 material_val = base_price*0.13;
		 }else if(material.equalsIgnoreCase("electronics")){
			
			 material_val = base_price*0.02;
		 }
		
		 double total_cost = base_price + person_val + material_val;
		 final_cost = (double) Math.round(total_cost * 100) / 100; // rounding the cost
		
		 
		 return final_cost;
		
			
		
	}
}