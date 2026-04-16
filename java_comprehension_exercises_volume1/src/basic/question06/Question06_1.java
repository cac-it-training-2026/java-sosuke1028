package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		String[] messege = { "こんにちは", "javaの学習中", "繰り返しの演習", "頑張ります" };

		for (int i = 0; i < 4; i++) {
			System.out.println(messege[0]);
			System.out.println(messege[1]);
			System.out.println(messege[2]);
			System.out.println(messege[3]);

		}

		System.out.println("繰り返し処理が終わりました。");
	}
}