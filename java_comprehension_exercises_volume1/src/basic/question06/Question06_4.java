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

		do {
			ammountBooks++;

			System.out.println("本を売却する数を一つ増やしますか？");
			System.out.println("はい：0、いいえ：１");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			SellFlag = Integer.parseInt(str);

		} while (SellFlag == 0);
		System.out.println("売却する本の冊数は" + ammountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + ammountBooks * bookprice + "円です。");

	}

}
