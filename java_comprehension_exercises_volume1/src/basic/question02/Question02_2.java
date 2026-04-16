package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		System.out.println("商品の名前と値を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String itemeNameString = reader.readLine();

		String itemprice = reader.readLine();

		int num = Integer.parseInt(itemprice);

		System.out.println("商品の名前は" + itemeNameString + "です。");
		System.out.println("商品の値段は" + num + "円です。");

	}
}
