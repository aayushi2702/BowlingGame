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
		bowlingGameService.rollingABowl_InBowlingGameTest(0);
	}

	@Test
	public void getARollerBowlScoringAGutterBowlTests() {
		int timesABowlRolls = 20;
		int pinsDown = 0;
		rollABowl(timesABowlRolls, pinsDown);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(0));
	}

	@Test
	public void getARollerBowlToScoreAGameOf_1Tests() {
		int timesABowlRolls=20;
		int pinsDown=1;
		rollABowl(timesABowlRolls, pinsDown);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(20));
	}

	private void rollABowl(int timesABowlRolls, int pinsDown ) {
		for (int i = 0; i < timesABowlRolls; i++) {
			bowlingGameService.rollingABowl_InBowlingGameTest(pinsDown);

		}
	}
}
