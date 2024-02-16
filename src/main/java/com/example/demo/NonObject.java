package com.example.demo;

public class NonObject {
	public static void main(String[] args) {
		//データの代入
		/**変数代入*/
		int[] score = { 80, 100, 75 };
		String[] name = { "須崎", "李", "賀来" };
		

		//データ表示
		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i] + "さん：" + score[i] + "点");
		}
	}
}
