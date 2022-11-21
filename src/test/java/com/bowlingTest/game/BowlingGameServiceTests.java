package com.bowlingTest.game;

import org.junit.jupiter.api.Test;

import com.bowling.game.BowlingGameService;

public class BowlingGameServiceTests {

	@Test
	public void getABowlingGame() {
		new BowlingGameService();
	}

	@Test
	public void getARollerBowlInBowlingGame() {
		BowlingGameService bowlingGameService = new BowlingGameService();
		bowlingGameService.rollingABowl_InBowlingGameTest(0);
	}

}
