package com.bowlingTest.game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.bowling.game.BowlingGameService;

public class BowlingGameServiceTests {

	BowlingGameService bowlingGameService;
	private static final int[] GUTTER_GAME = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private static final int[] EACH_ROLL_PINS_DOWN_1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	private static final int[] SPARE_START_FOLLOWED_BY_3_REST_0 = { 5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0 };
	private static final int[] SPARE_START_FOLLOWED_BY_3_FOLLOWED_BY_3 = { 10, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0 };
	private static final int[] ALL_STRIKES_FOLLOWED_BY_3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10,10,10};

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
		bowlingGameService.rollABowl(GUTTER_GAME);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(0));
	}

	@Test
	public void getARollerBowlToScoreAGameOf_1Tests() {
		bowlingGameService.rollABowl(EACH_ROLL_PINS_DOWN_1);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(20));
	}

	@Test
	public void getARollerBowlToScoreASpareFollowedBy3Tests() {
		bowlingGameService.rollABowl(SPARE_START_FOLLOWED_BY_3_REST_0);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(16));
	}

	@Test
	public void getARollerBowlToScoreAStrikeFollowedBy3AndFollowedBy3() {
		bowlingGameService.rollABowl(SPARE_START_FOLLOWED_BY_3_FOLLOWED_BY_3);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(22));
	}
	
	@Test
	public void getGameScore_WithAllFramesScoringStrikeTest() {
		bowlingGameService.rollABowl(ALL_STRIKES_FOLLOWED_BY_3);
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(300));
	}

}
