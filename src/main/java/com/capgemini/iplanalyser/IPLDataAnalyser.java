package com.capgemini.iplanalyser;
import com.capgemini.pojo.*;
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


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class IPLDataAnalyser<E> {

	public double TopBattingAverage(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		String avg = csvToBeanBuilder.parse().stream().filter(l -> !(l.average.equals("-")))
				.map(l -> l.average.toString())
				.max((l1, l2) -> 1 + (int) (Double.parseDouble(l1) - Double.parseDouble(l2))).get();
		return Double.parseDouble(avg);

	}

	public double TopStrikeRate(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		Double strikeRate = csvToBeanBuilder.parse().stream().map(l -> l.strikeRate)
				.max((l1, l2) -> 1 + (int) ((l1) - (l2))).get();
		return (strikeRate);

	}

	public double HighestSixes(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		Integer sixes = csvToBeanBuilder.parse().stream().map(l -> l.sixes).max((l1, l2) -> 1 + (int) ((l1) - (l2)))
				.get();
		return (sixes);

	}

	public double HighestFours(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		Integer fours = csvToBeanBuilder.parse().stream().map(l -> l.fours).max((l1, l2) -> 1 + (int) ((l1) - (l2)))
				.get();
		return (fours);

	}

	public String BestStrikeRatewSixesFours(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<IPLBatter> bestStrikeRatewSixesFours = csvToBeanBuilder.parse().stream()
				.sorted((l1, l2) -> 1 + (int) ((l2.strikeRate) - (l1.strikeRate))).limit(20)
				.sorted((l1, l2) -> 1 + (int) ((l2.fours) - (l1.fours))).limit(10)
				.sorted((l1, l2) -> 1 + (int) ((l2.sixes) - (l1.sixes))).limit(5).collect(Collectors.toList());
		return (bestStrikeRatewSixesFours).get(0).player;

	}

	public String BestStrikeRatewAverage(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<IPLBatter> bestStrikeRatewAverage = csvToBeanBuilder.parse().stream()
				.sorted((l1, l2) -> 1 + (int) ((l2.strikeRate) - (l1.strikeRate))).limit(10)
				.filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.limit(5).collect(Collectors.toList());
		return (bestStrikeRatewAverage).get(0).player;

	}

	public String BestAveragewStrikeRate(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<IPLBatter> bestStrikeRatewAverage = csvToBeanBuilder.parse().stream().filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.sorted((l1, l2) -> 1 + (int) ((l2.strikeRate) - (l1.strikeRate))).limit(10).limit(5)
				.collect(Collectors.toList());
		return (bestStrikeRatewAverage).get(0).player;

	}

	public double TopBowlingAverage(String filePath) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilder = (CsvToBean<IPLBowler>) getBean(filePath, IPLBowler.class);
		String avg = csvToBeanBuilder.parse().stream().filter(l -> !(l.avg.equals("-"))).map(l -> l.avg.toString())
				.max((l1, l2) -> 1 + (int) (Double.parseDouble(l2) - Double.parseDouble(l1))).get();
		return Double.parseDouble(avg);

	}

	public double TopStrikingRate(String filePath) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilder = (CsvToBean<IPLBowler>) getBean(filePath, IPLBowler.class);
		String sr = csvToBeanBuilder.parse().stream().filter(l -> !(l.avg.equals("-"))).map(l -> l.sr.toString())
				.max((l1, l2) -> 1 + (int) (Double.parseDouble(l2) - Double.parseDouble(l1))).get();
		return Double.parseDouble(sr);

	}

	public double TopEconomy(String filePath) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilder = (CsvToBean<IPLBowler>) getBean(filePath, IPLBowler.class);
		Double economy = csvToBeanBuilder.parse().stream().map(l -> l.econ).max((l1, l2) -> 1 + (int) ((l2) - (l1)))
				.get();
		return (economy);
	}

	public String TopStrikeRatew5Ww4W(String filePath) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilder = (CsvToBean<IPLBowler>) getBean(filePath, IPLBowler.class);
		List<IPLBowler> topstrikeratew5ww4w = csvToBeanBuilder.parse().stream().filter(l -> !(l.sr.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l1.sr) - Double.parseDouble(l2.sr))).limit(20)
				.sorted((l1, l2) -> 1 + (int) ((l2.fourW) - (l1.fourW))).limit(10)
				.sorted((l1, l2) -> 1 + (int) ((l2.fiveW) - (l1.fiveW))).limit(5).collect(Collectors.toList());
		return (topstrikeratew5ww4w).get(0).player;
	}

	public String TopWicketswAverage(String filePath) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilder = (CsvToBean<IPLBowler>) getBean(filePath, IPLBowler.class);
		List<IPLBowler> topstrikeratew5ww4w = csvToBeanBuilder.parse().stream()
				.sorted((l1, l2) -> 1 + (int) ((l2.wkts) - (l1.wkts))).limit(10).filter(l -> !(l.sr.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l1.avg) - Double.parseDouble(l2.avg))).limit(5)
				.collect(Collectors.toList());
		return (topstrikeratew5ww4w).get(0).player;
	}

	public String TopBattingBowlingAverage(String filePath, String filePath2) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilderBowl = (CsvToBean<IPLBowler>) getBean(filePath2, IPLBowler.class);
		CsvToBean<IPLBatter> csvToBeanBuilderBat = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<String> BowlersNames = csvToBeanBuilderBowl.parse().stream().filter(l -> !(l.avg.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l1.avg) - Double.parseDouble(l2.avg)))
				.map(l -> l.player).limit(20).collect(Collectors.toList());
		List<String> BatterNames = csvToBeanBuilderBat.parse().stream().filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.limit(20).map(l -> l.player).collect(Collectors.toList());
		List<String> allRounders = BatterNames.stream().filter(l -> BowlersNames.contains(l)).limit(5)
				.collect(Collectors.toList());
		return (allRounders).get(0);
	}

	public String TopRunsWickets(String filePath, String filePath2) throws IOException {
		CsvToBean<IPLBowler> csvToBeanBuilderBowl = (CsvToBean<IPLBowler>) getBean(filePath2, IPLBowler.class);
		CsvToBean<IPLBatter> csvToBeanBuilderBat = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<String> BowlersNames = csvToBeanBuilderBowl.parse().stream().filter(l -> !(l.avg.equals("-")))
				.sorted((l1, l2) -> 1 + (int) ((l1.wkts) - (l2.wkts))).map(l -> l.player).limit(20)
				.collect(Collectors.toList());
		List<String> BatterNames = csvToBeanBuilderBat.parse().stream().filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) ((l2.runs) - (l1.runs))).map(l -> l.player).limit(20)
				.collect(Collectors.toList());
		List<String> topRunsWickets = BatterNames.stream().filter(l -> BowlersNames.contains(l)).limit(5)
				.collect(Collectors.toList());
		return (topRunsWickets).get(0);
	}

	public String MaxHundredTopBattingavg(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<IPLBatter> maxHundredTopBattingavg = csvToBeanBuilder.parse().stream()
				.sorted((l1, l2) -> 1 + (int) ((l2.century) - (l1.century))).limit(10)
				.filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.limit(5).collect(Collectors.toList());
		return (maxHundredTopBattingavg).get(0).player;
	}

	public String ZeroHundredFiftywMaxAvg(String filePath) throws IOException {
		CsvToBean<IPLBatter> csvToBeanBuilder = (CsvToBean<IPLBatter>) getBean(filePath, IPLBatter.class);
		List<IPLBatter> zeroHundredFiftywMaxAvg = csvToBeanBuilder.parse().stream().filter(l -> l.century == 0)
				.filter(l -> l.halfCentury == 0).filter(l -> !(l.average.equals("-")))
				.sorted((l1, l2) -> 1 + (int) (Double.parseDouble(l2.average) - Double.parseDouble(l1.average)))
				.limit(5).collect(Collectors.toList());
		return (zeroHundredFiftywMaxAvg).get(0).player;
	}

	public CsvToBean<E> getBean(String Filepath, Class csvClass) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get(Filepath));
		CsvToBean<E> csvToBeanBuilder = new CsvToBeanBuilder<E>(reader).withType(csvClass)
				.withIgnoreLeadingWhiteSpace(true).build();
		return csvToBeanBuilder;

	}
}
