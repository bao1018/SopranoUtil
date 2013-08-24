package com.pwc.soprano.util;

import com.pwc.soprano.util.WordSequenceAligner.Alignment;

public class WordErrorRateTest {
	public static void main(String[] args) {
		String str1 = "the quick brown cow jumped over the moon";
		String str2 = "quick brown cows jumped way over the moon dude";
		try {
			System.out.println("WER: "+WordErrRate.compare(str1, str2));
			System.out.println("---------------------------");
			WordSequenceAligner wsa = new WordSequenceAligner();
			Alignment alignment = wsa.align(str1.split(" "), str2.split(" "));
			System.out.println("WordSequenceAligner: "+ alignment.getWER());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
