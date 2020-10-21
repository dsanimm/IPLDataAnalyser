package com.capgemini.iplanalysisproblem;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IPLDataAnalyserTest {
	IPLDataAnalyser ipldataAnalyser;

	@Before
	public void setUp() {
		ipldataAnalyser = new IPLDataAnalyser();
	}

	@Test
	public void iFReadCountRightReturnTrue() {
		String filePath = "C:/Users/Deepanshu Singh/eclipse-workspace/JavaPractice/WP DP Data_01 IPL2019FactsheetMostRuns.csv";
		try {
			try {Assert.
				assertEquals(83.2, (ipldataAnalyser).TopBattingAverage(filePath),0.01);
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
