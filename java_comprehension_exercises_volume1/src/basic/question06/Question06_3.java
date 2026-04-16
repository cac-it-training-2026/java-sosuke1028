package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int ammount = 0;
		int price = 100;

		System.out.println("鉛筆を購入しますか？");
		System.out.println("はい：0、いいえ：１");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int buyFlag = Integer.parseInt(str);
		int i = 0;

		while (buyFlag == 0) {
			i++;
			System.out.println("購入する鉛筆を増やしますか？");
			System.out.println("はい：0、いいえ：１");
			str = reader.readLine();
			buyFlag = Integer.parseInt(str);

		}

		System.out.println("購入した鉛筆の数は" + i + "本です");
		System.out.println("購入した鉛筆の合計金額は" + i * price + "円です。");

	}

}
