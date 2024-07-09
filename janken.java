package ジャンケン;

import java.util.Random;
import java.util.Scanner;

public class Janken {
	
	public static void main(String[] args) {
		
		//メッセージ表示
		System.out.println("ジャンケンで出す手を選んでください");
		 
		
		//入力した値を読み込む
		Scanner scanner = new Scanner(System.in);
		int userHands = scanner.nextInt();
		
		
		//入力チェック
		while (userHands >= 3) {
			System.out.println("もう一度じゃんけんで出す手を選んでください");
			userHands = scanner.nextInt();
		}
		
		
		//CPUの出す手を決める
		Random rand = new Random(); 
		int cpuHands = rand.nextInt(3);
		
		
		//結果判定
		String result;
		if (userHands == cpuHands) {
			result = "あいこです";
		} else if ((userHands == 0 && cpuHands == 1) ||
			(userHands == 1 && cpuHands == 2) ||
			(userHands == 2 && cpuHands == 0)) {
			result = "あなたの勝ちです";
		} else {
			result = "あなたの負けです";
		}
		
		
		//結果出力
		String[] hands = {"グー", "チョキ", "パー"};
		System.out.println("ジャンケンポン");
		System.out.println("あなた：" + hands[userHands]);
		System.out.println("CPU：" + hands[cpuHands]);
		System.out.println("結果：" + result);
		
		
		scanner.close();
	}
}
