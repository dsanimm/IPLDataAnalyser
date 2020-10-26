package com.capgemini.pojo;

import com.opencsv.bean.CsvBindByName;

public class IPLBowler {
	@CsvBindByName(column = "POS")
	public int position;
	@CsvBindByName(column = "PLAYER")
	public String player;
	@CsvBindByName(column = "MAT")
	public int match;
	@CsvBindByName(column = "Inns")
	public int innings;
	@CsvBindByName(column = "Ov")
	public double Ov;
	@CsvBindByName(column = "Runs")
	public int runs;
	@CsvBindByName(column = "Wkts")
	public int wkts;
	@CsvBindByName(column = "BBI")
	public int bbi;
	@CsvBindByName(column = "Avg")
	public String avg;
	@CsvBindByName(column = "Econ")
	public double econ;
	@CsvBindByName(column = "Sr")
	public String sr;
	@CsvBindByName(column = "4w")
	public int fourW;
	@CsvBindByName(column = "5w")
	public int fiveW;
	@Override
	public String toString() {
		return "IPLBowlingData [position=" + position + ", player=" + player + ", match=" + match + ", innings="
				+ innings + ", Ov=" + Ov + ", runs=" + runs + ", wkts=" + wkts + ", bbi=" + bbi + ", avg=" + avg
				+ ", econ=" + econ + ", sr=" + sr + ", fourW=" + fourW + ", fiveW=" + fiveW + "]";
	}

}
