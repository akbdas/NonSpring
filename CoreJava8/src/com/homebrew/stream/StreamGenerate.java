package com.homebrew.stream;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {
	
		Stream<String> stream = Stream.generate(() -> "hello").limit(10);
		stream.forEach(System.out::println);
		
		String x="fgk,gfgfdg,gfdgfgf,gfdttytryt,trt";
		Pattern.compile(",").splitAsStream(x).parallel().forEach(System.out::println);
		
		int result = IntStream.of(1, 2, 3, 4).reduce(10, (a, b) -> a + b);
		System.out.println(result);

		
	};
	
}
