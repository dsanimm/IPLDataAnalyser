package com.capgemini.iplanalysisproblem;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class IPLDataAnalyser<E> {

	public double TopBattingAverage(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		String avg = csvToBeanBuilder.parse().stream().filter(l -> !(l.average.equals("-")))
				.map(l -> l.average.toString())
				.max((l1, l2) -> 1 + (int) (Double.parseDouble(l1) - Double.parseDouble(l2))).get();
		return Double.parseDouble(avg);

	}

	public double TopStrikeRate(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		Double strikeRate = csvToBeanBuilder.parse().stream().map(l -> l.strikeRate)
				.max((l1, l2) -> 1 + (int) ((l1) - (l2))).get();
		return (strikeRate);

	}

	public double HighestSixes(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		Integer sixes = csvToBeanBuilder.parse().stream().map(l -> l.sixes).max((l1, l2) -> 1 + (int) ((l1) - (l2)))
				.get();
		return (sixes);

	}

	public double HighestFours(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		Integer fours = csvToBeanBuilder.parse().stream().map(l -> l.fours).max((l1, l2) -> 1 + (int) ((l1) - (l2)))
				.get();
		return (fours);

	}

	public List<IPLBattingData> BestStrikeRatewSixesFours(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		List<IPLBattingData> bestStrikeRatewSixesFours = csvToBeanBuilder.parse().stream()
				.sorted((l1, l2) -> 1 + (int) ((l2.fours) - (l1.fours))).limit(20)
				.sorted((l1, l2) -> 1 + (int) ((l2.sixes) - (l1.sixes))).limit(10)
				.sorted((l1, l2) -> 1 + (int) ((l2.strikeRate) - (l1.strikeRate))).limit(5)
				.collect(Collectors.toList());
		return (bestStrikeRatewSixesFours);

	}

	public List<IPLBattingData> BestStrikeRatewAverage(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		List<IPLBattingData> bestStrikeRatewAverage = csvToBeanBuilder.parse().stream()
				.sorted((l1, l2) -> 1 + (int) ((l2.strikeRate) - (l1.strikeRate))).limit(10)
				.filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.limit(5).collect(Collectors.toList());
		return (bestStrikeRatewAverage);

	}

	public List<IPLBattingData> BestAveragewStrikeRate(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		List<IPLBattingData> bestStrikeRatewAverage = csvToBeanBuilder.parse().stream()
				.filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.sorted((l1, l2) -> 1 + (int) ((l2.strikeRate) - (l1.strikeRate))).limit(10)
				.limit(5).collect(Collectors.toList());
		return (bestStrikeRatewAverage);

	}
	public double TopBowlingAverage(String filePath) throws IOException {
		CsvToBean<IPLBattingData> csvToBeanBuilder = (CsvToBean<IPLBattingData>) getBean(filePath,IPLBattingData.class);
		String avg = csvToBeanBuilder.parse().stream().filter(l -> !(l.average.equals("-")))
				.map(l -> l.average.toString())
				.max((l1, l2) -> 1 + (int) (Double.parseDouble(l2) - Double.parseDouble(l1))).get();
		return Double.parseDouble(avg);

	}
	public CsvToBean<E> getBean(String Filepath,Class csvClass) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(Filepath));
		CsvToBean<E> csvToBeanBuilder = new CsvToBeanBuilder<E>(reader)
				.withType(csvClass).withIgnoreLeadingWhiteSpace(true).build();
		return csvToBeanBuilder;

	}

}
