package com.tinnova.multiplos;

import java.util.Arrays;

public class MultiplosApplication {

	public static void main(String[] args) {
		MultipleService multipleService = new MultipleService();
		Arrays.stream(args).map(multipleService::getSum).forEach(System.out::println);

	}

}
