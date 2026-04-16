package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		int basicprice = 1200;

		int tickets = 3;

		int reduceedPrice = basicprice - 200;

		int reducedTickets = tickets;

		int totalprice = reduceedPrice * reducedTickets;

		double taxrate = 1.1;

		int totalWithTax = (int) (totalprice * taxrate);

		System.out.println("購入可能額は" + reducedTickets + "枚です");
		System.out.println("値下げ後の１枚あたりのの料金は" + reduceedPrice + "円です。");
		System.out.println("合計金額（税抜）" + totalprice + "です。");
		System.out.println("合計金額（税込）" + totalWithTax + "です。");
	}
}
