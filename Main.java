package com.leetcode;

import com.leetcode.backtracking.CountofMatchesinTournament1688;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
/*	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();

		//라인단위로 입력받기(Enter를 경계로)
	    String str = bf.readLine();

		//정수형 입력이라면, 형변환 필수!
	    int i = Integer.parseInt(bf.readLine());

		//Space를 경계로 끊어야 할 때
	    String arr[] = str.split(" ");
		//또는 StringTokenizer 클래스 이용)*/

	    int[] param = {-1, 0, 1,1,1,2, 0, 1, 0};
	    CountofMatchesinTournament1688 input = new CountofMatchesinTournament1688();
//	    System.out.println(input.moveZeroes(param));
//	    input.numberOfMatches(7);
	    int n = 1, num = 26;
	    System.out.println(n>>>2);
	    System.out.printf("16진수 4비트: ");
	    System.out.println(n & 0xF);
	    StringBuffer sb = new StringBuffer();
//	    sb.append("1234");
//	    System.out.println(sb.toString());
//	    sb.append(5679);
//	    System.out.println(sb.toString());


	    int res = 0;
		int[] prices = {7,1,5,3,6,4};
	    for(int i = 0; i < prices.length; i++) {
		    int max = -1;
		    for(int j = i + 1; j < prices.length; j++) {
			    if(prices[j] > max) {
				    max = prices[j];

			    }
		    }
		    if(max > prices[i]) res = Math.max(max - prices[i], res);
	    }

    }
}
