package com.bowling.game;

public class BowlingGameService {
	private int score = 0;

	public void rollingABowl_InBowlingGameTest(int pinDows) {
		score=score+pinDows;
	}

	public int getScoreAfterBowlHits() {
		return score;
	}

}
