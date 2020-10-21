package com.capgemini.iplanalysisproblem;

import com.opencsv.bean.CsvBindByName;

public class IPLBowlingData {
	@CsvBindByName(column = "POS", required = true)
	public int POS;
	@CsvBindByName(column = "Player", required = true)
	public String PLAYER;
	@CsvBindByName(column = "Mat", required = true)
	public int Mat;
	@CsvBindByName(column = "Inns", required = true)
	public int Inns;
	@CsvBindByName(column = "NO", required = true)
	public int NO;
	@CsvBindByName(column = "Runs", required = true)
	public int Runs;
	@CsvBindByName(column = "HS", required = true)
	public int HS;
	@CsvBindByName(column = "Avg", required = true)
	public int Avg;
	@CsvBindByName(column = "BF", required = true)
	public int BF;
	@CsvBindByName(column = "SR", required = true)
	public int SR;
	@CsvBindByName(column = "100", required = true)
	public int centuries;
	@CsvBindByName(column = "50", required = true)
	public int halfCenturies;
	@CsvBindByName(column = "4s", required = true)
	public int fours;
	@CsvBindByName(column = "6s", required = true)
	public int sixes;

}
