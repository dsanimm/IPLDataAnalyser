package com.capgemini.iplanalysisproblem;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IPLDataAnalyserTest {
	IPLDataAnalyser ipldataAnalyser;
	String FILEPATH = "C:/Users/Deepanshu Singh/eclipse-workspace/JavaPractice/WP DP Data_01 IPL2019FactsheetMostRuns.csv";
	String FILEPATH2 = "C:/Users/Deepanshu Singh/eclipse-workspace/JavaPractice/WP DP Data_02 IPL2019FactsheetMostWkts.csv";

	@Before
	public void setUp() {
		ipldataAnalyser = new IPLDataAnalyser();
	}

	@Test
	public void iFAverageHighestReturnTrue() {

		try {
			Assert.assertEquals(83.2, (ipldataAnalyser).TopBattingAverage(FILEPATH), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFStrikeRateHighestReturnTrue() {

		try {
			Assert.assertEquals(333.33, (ipldataAnalyser).TopStrikeRate(FILEPATH), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFSixesHighestReturnTrue() {

		try {
			Assert.assertEquals(52, (ipldataAnalyser).HighestSixes(FILEPATH), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFFoursHighestReturnTrue() {

		try {
			Assert.assertEquals(64, (ipldataAnalyser).HighestFours(FILEPATH), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFBestStrikeRatewSixesFours() {

		try {
			(ipldataAnalyser).BestStrikeRatewSixesFours(FILEPATH).forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFBestStrikeRatewAverage() {

		try {
			(ipldataAnalyser).BestStrikeRatewAverage(FILEPATH).forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFBestAveragewStrikeRate() {

		try {
			(ipldataAnalyser).BestAveragewStrikeRate(FILEPATH).forEach(System.out::println);
			;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFTopBowlingAverage() {

		try {
			Assert.assertEquals(11.0, (ipldataAnalyser).TopBowlingAverage(FILEPATH2), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFTopStrikeRateForBowler() {

		try {
			Assert.assertEquals(8.66, (ipldataAnalyser).TopStrikingRate(FILEPATH2), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFTopEconomy() {

		try {
			Assert.assertEquals(6.69, (ipldataAnalyser).TopEconomy(FILEPATH2), 0.01);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFTopStrikeRatew5Ww4W() {

		try {
			(ipldataAnalyser).TopStrikeRatew5Ww4W(FILEPATH2).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFTopWicketswAverage() {

		try {
			(ipldataAnalyser).TopWicketswAverage(FILEPATH2).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void iFTopBattingBowlingAverage() {

		try {
			(ipldataAnalyser).TopBattingBowlingAverage(FILEPATH,FILEPATH2).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void iFTopRunsWickets() {

		try {
			(ipldataAnalyser).TopRunsWickets(FILEPATH,FILEPATH2).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void iFMaxHundredTopBattingavg() {

		try {
			(ipldataAnalyser).MaxHundredTopBattingavg(FILEPATH).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		@Test
		public void iFZeroHundredFiftywMaxAvg() {

			try {
				(ipldataAnalyser).ZeroHundredFiftywMaxAvg(FILEPATH).forEach(System.out::println);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
