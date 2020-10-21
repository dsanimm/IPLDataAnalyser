package com.capgemini.iplanalysisproblem;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IPLDataAnalyserTest {
	IPLDataAnalyser ipldataAnalyser;
	String filePath = "C:/Users/Deepanshu Singh/eclipse-workspace/JavaPractice/WP DP Data_01 IPL2019FactsheetMostRuns.csv";
	String filePath2 = "C:/Users/Deepanshu Singh/eclipse-workspace/JavaPractice/WP DP Data_02 IPL2019FactsheetMostWkts.csv";


	@Before
	public void setUp() {
		ipldataAnalyser = new IPLDataAnalyser();
	}

	@Test
	public void iFAverageHighestReturnTrue() {

		try {
			try {
				Assert.assertEquals(83.2, (ipldataAnalyser).TopBattingAverage(filePath), 0.01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFStrikeRateHighestReturnTrue() {

		try {
			try {
				Assert.assertEquals(333.33, (ipldataAnalyser).TopStrikeRate(filePath), 0.01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFSixesHighestReturnTrue() {

		try {
			try {
				Assert.assertEquals(52, (ipldataAnalyser).HighestSixes(filePath), 0.01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFFoursHighestReturnTrue() {

		try {
			try {
				Assert.assertEquals(64, (ipldataAnalyser).HighestFours(filePath), 0.01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFBestStrikeRatewSixesFours() {

		try {
			try {
				(ipldataAnalyser).BestStrikeRatewSixesFours(filePath).forEach(System.out::println);
				;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFBestStrikeRatewAverage() {

		try {
			try {
				(ipldataAnalyser).BestStrikeRatewAverage(filePath).forEach(System.out::println);
				;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFBestAveragewStrikeRate() {

		try {
			try {
				(ipldataAnalyser).BestAveragewStrikeRate(filePath).forEach(System.out::println);
				;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void iFTopBowlingAverage() {
		try {
			try {
				Assert.assertEquals(11.0, (ipldataAnalyser).TopBowlingAverage(filePath2), 0.01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void iFTopStrikeRateForBowler() {
		try {
			try {
				Assert.assertEquals(8.6, (ipldataAnalyser).TopStrikingRate(filePath2), 0.01);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
