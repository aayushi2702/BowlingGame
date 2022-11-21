package com.bowlingTest.game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.bowling.game.BowlingGameService;

public class BowlingGameServiceTests {

	BowlingGameService bowlingGameService;

	@Before
	public void setUp() {
		bowlingGameService = new BowlingGameService();
	}

	@Test
	public void getABowlingGame() {
		new BowlingGameService();
	}

	@Test
	public void getARollerBowlInBowlingGame() {
		BowlingGameService bowlingGameService = new BowlingGameService();
		bowlingGameService.rollingABowl_InBowlingGameTest(0);
	}

	@Test
	public void getARollerBowlScoringAGutterBowlTests() {
		BowlingGameService bowlingGameService = new BowlingGameService();
		for (int i = 0; i < 20; i++) {
			bowlingGameService.rollingABowl_InBowlingGameTest(0);

		}
		assertThat(bowlingGameService.getScoreAfterBowlHits(),is(0));
	}

}
