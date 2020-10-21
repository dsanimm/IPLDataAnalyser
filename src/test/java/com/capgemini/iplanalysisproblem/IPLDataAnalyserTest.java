package com.capgemini.iplanalysisproblem;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class IPLDataAnalyserTest {

	@Test
	public void iFReadCountRightReturnTrue() {
		String filePath = "WP DP Data_01 IPL2019FactsheetMostRuns.csv";
		IPLDataAnalyser ipldataAnalyser = new IPLDataAnalyser();
		try {
			try {
				assertEquals(100, ipldataAnalyser.processIPLData(filePath));
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



