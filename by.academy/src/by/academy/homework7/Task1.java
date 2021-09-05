package by.academy.homework7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
	public static void main(String... args) {
		Map<Double, String> mapStream = Stream.generate(() -> (new Random().nextInt(100))).map(x -> x.longValue())
				.distinct().limit(100).map(x -> x * Math.PI - 20).filter(x -> x < 100).sorted().skip(3)
				.collect(Collectors.toMap(p -> p, t -> "Number: " + t));
		mapStream.forEach((k, v) -> System.out.println(v));
	}
}
