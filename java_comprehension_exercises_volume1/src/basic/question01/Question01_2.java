package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {
		int appleprice = 100;
		String statinary = "鉛筆";

		int bananaprice = appleprice;
		String writinhgUtensils = statinary;

		System.out.println("リンゴの値段は" + appleprice + "円です。");
		System.out.println("バナナの値段は" + bananaprice + "円です。");
		System.out.println("この筆記用具は" + writinhgUtensils + "です。");

	}

}
