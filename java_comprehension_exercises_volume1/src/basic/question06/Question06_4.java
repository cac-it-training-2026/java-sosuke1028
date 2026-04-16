package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
         int ammountBooks = 0;
         int SellFlag = 0;
         int bookprice = 200;
         
         System.out.println("本を売却します。");

         
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String str = reader.readLine();
 		int sellFlag = Integer.parseInt(str);
 		
 		do ammountBooks++;
 		System.out.println("？");
		System.out.println("はい：0、いいえ：１");
         
         while(sellFlag==0) {
        	 ammountBooks++;
        	 
        	 
        	 
        	 
        	 
        	 
         }
         
		

	}

}
