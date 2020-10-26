package com.capgemini.iplanalyser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.pojo.IPLBatter;

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
			Assert.assertEquals("Andre Russell",ipldataAnalyser.BestStrikeRatewSixesFours(FILEPATH));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFBestStrikeRatewAverage() {

		try {
			Assert.assertEquals("Andre Russell",ipldataAnalyser.BestStrikeRatewAverage(FILEPATH));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFBestAveragewStrikeRate() {

		try {
			Assert.assertEquals("Andre Russell",ipldataAnalyser.BestAveragewStrikeRate(FILEPATH));
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
			Assert.assertEquals("Kagiso Rabada",ipldataAnalyser.TopStrikeRatew5Ww4W(FILEPATH2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void iFTopWicketswAverage() {

		try {
			Assert.assertEquals("Imran Tahir",ipldataAnalyser.TopWicketswAverage(FILEPATH2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void iFTopBattingBowlingAverage() {

		try {
			Assert.assertEquals("Ravindra Jadeja",ipldataAnalyser.TopBattingBowlingAverage(FILEPATH,FILEPATH2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void iFTopRunsWickets() {

		try {
			Assert.assertEquals("Andre Russell",ipldataAnalyser.TopRunsWickets(FILEPATH,FILEPATH2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void iFMaxHundredTopBattingavg() {

		try {
			Assert.assertEquals("David Warner",ipldataAnalyser.MaxHundredTopBattingavg(FILEPATH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		@Test
		public void iFZeroHundredFiftywMaxAvg() {

			try {
				Assert.assertEquals("Marcus Stoinis",ipldataAnalyser.ZeroHundredFiftywMaxAvg(FILEPATH));
				System.out.println(ipldataAnalyser.ZeroHundredFiftywMaxAvg(FILEPATH));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
