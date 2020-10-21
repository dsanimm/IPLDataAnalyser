package com.capgemini.iplanalysisproblem;

import com.opencsv.bean.CsvBindByName;

public class IPLBowlingData {
	@CsvBindByName(column = "POS")
	int position;
	@CsvBindByName(column = "PLAYER")
	String player;
	@CsvBindByName(column = "MAT")
	int match;
	@CsvBindByName(column = "Inns")
	int innings;
	@CsvBindByName(column = "Ov")
	double Ov;
	@CsvBindByName(column = "Runs")
	int runs;
	@CsvBindByName(column = "Wkts")
	int wkts;
	@CsvBindByName(column = "BBI")
	int bbi;
	@CsvBindByName(column = "Avg")
	String avg;
	@CsvBindByName(column = "Econ")
	double econ;
	@CsvBindByName(column = "Sr")
	String sr;
	@CsvBindByName(column = "4w")
	int fourW;
	@CsvBindByName(column = "5w")
	int fiveW;
	@Override
	public String toString() {
		return "IPLBowlingData [position=" + position + ", player=" + player + ", match=" + match + ", innings="
				+ innings + ", Ov=" + Ov + ", runs=" + runs + ", wkts=" + wkts + ", bbi=" + bbi + ", avg=" + avg
				+ ", econ=" + econ + ", sr=" + sr + ", fourW=" + fourW + ", fiveW=" + fiveW + "]";
	}

}
