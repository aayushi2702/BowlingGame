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
		rollABowl(20, 0);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(0));
	}

	@Test
	public void getARollerBowlToScoreAGameOf_1Tests() {
		rollABowl(20, 1);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(20));
	}

	@Test
	public void getARollerBowlToScoreASpareFollowedBy3Tests() {
		bowlingGameService.rollingABowl_InBowlingGameTest(5);
		bowlingGameService.rollingABowl_InBowlingGameTest(5);
		bowlingGameService.rollingABowl_InBowlingGameTest(3);
		rollABowl(17, 0);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(16));
	}

	private void rollABowl(int timesABowlRolls, int pinsDown) {
		for (int i = 0; i < timesABowlRolls; i++) {
			bowlingGameService.rollingABowl_InBowlingGameTest(pinsDown);

		}
	}
}
