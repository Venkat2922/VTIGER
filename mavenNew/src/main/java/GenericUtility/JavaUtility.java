package GenericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public static int generateRanNum() {
		Random r=new Random();
		int ranNum=r.nextInt(1000);
		System.out.println(ranNum);
		return ranNum;
	}
	public String generateDate() {
		Date date=new Date();
		String d = date.toString();
		//System.out.println(d);
		
		String[] arr = d.split(" ");
		String day=arr[0];
		String month=arr[1];
		String date1=arr[2];
		String year=arr[5];
		String exp=day+" "+month+" "+date1+" "+year;
		return exp;
		
	}


	
	
	
	
	

}
