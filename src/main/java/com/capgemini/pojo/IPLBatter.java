package com.capgemini.pojo;

import com.opencsv.bean.CsvBindByName;

public class IPLBatter {
	@CsvBindByName(column = "POS")
	public int position;
	@CsvBindByName(column = "PLAYER")
	public String player;
	@CsvBindByName(column = "MAT")
	public int match;
	@CsvBindByName(column = "Inns")
	public int innings;
	@CsvBindByName(column = "NO")
	public int notOut;
	@CsvBindByName(column = "Runs")
	public int runs;
	@CsvBindByName(column = "HS")
	public String highestScore;
	@CsvBindByName(column = "Avg")
	public String average;
	@CsvBindByName(column = "BF")
	public int ballFaced;
	@CsvBindByName(column = "SR")
	public double strikeRate;
	@CsvBindByName(column = "100")
	public int century;
	@CsvBindByName(column = "50")
	public int halfCentury;
	@CsvBindByName(column = "4s")
	public int fours;
	@CsvBindByName(column = "6s")
	public int sixes;

	@Override
	public String toString() {
		return "IPLBatting [position=" + position + ", player=" + player + ", match=" + match + ", innings=" + innings
				+ ", notOut=" + notOut + ", runs=" + runs + ", highestScore=" + highestScore + ", average=" + average
				+ ", ballFaced=" + ballFaced + ", strikeRate=" + strikeRate + ", century=" + century + ", halfCentury="
				+ halfCentury + ", fours=" + fours + ", sixes=" + sixes + "]";
	}
}