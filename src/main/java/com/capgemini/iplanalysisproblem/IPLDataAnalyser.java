package com.capgemini.iplanalysisproblem;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class IPLDataAnalyser<E> {

	public double TopBattingAverage(String filePath) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(filePath));
		CsvToBean<IPLBattingData> csvToBeanBuilder = new CsvToBeanBuilder<IPLBattingData>(reader)
				.withType(IPLBattingData.class).withIgnoreLeadingWhiteSpace(true).build();
		String avg = csvToBeanBuilder.parse().stream().filter(l -> !(l.average.equals("-")))
				.map(l -> l.average.toString())
				.max((l1, l2) -> 1 + (int) (Double.parseDouble(l1) - Double.parseDouble(l2))).get();
		return Double.parseDouble(avg);

	}

	public double TopStrikeRate(String filePath) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(filePath));
		CsvToBean<IPLBattingData> csvToBeanBuilder = new CsvToBeanBuilder<IPLBattingData>(reader)
				.withType(IPLBattingData.class).withIgnoreLeadingWhiteSpace(true).build();
		Double strikeRate = csvToBeanBuilder.parse().stream().map(l -> l.strikeRate)
				.max((l1, l2) -> 1 + (int) ((l1) - (l2))).get();
		return (strikeRate);

	}
	public double HighestSixes(String filePath) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(filePath));
		CsvToBean<IPLBattingData> csvToBeanBuilder = new CsvToBeanBuilder<IPLBattingData>(reader)
				.withType(IPLBattingData.class).withIgnoreLeadingWhiteSpace(true).build();
		Integer sixes = csvToBeanBuilder.parse().stream().map(l -> l.sixes)
				.max((l1, l2) -> 1 + (int) ((l1) - (l2))).get();
		return (sixes);

	}
	public double HighestFours(String filePath) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(filePath));
		CsvToBean<IPLBattingData> csvToBeanBuilder = new CsvToBeanBuilder<IPLBattingData>(reader)
				.withType(IPLBattingData.class).withIgnoreLeadingWhiteSpace(true).build();
		Integer fours = csvToBeanBuilder.parse().stream().map(l -> l.fours)
				.max((l1, l2) -> 1 + (int) ((l1) - (l2))).get();
		return (fours);

	}

}
