package com.sayan.sandbox.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sandbox {
	private static final String TEST = "bla bla";
	
	public static void main(String[] args)
	{
		// using static variable in a stream()
		testStaticInStream();
	}
	
	public static void testStaticInStream()
	{
		List<String> list = new ArrayList<>();
		list.addAll(List.of("a","b","c","d", Sandbox.TEST));
		List<String> result = list.stream().filter(element -> element.equalsIgnoreCase(Sandbox.TEST)).collect(Collectors.toList());
		System.out.println(result);
	}
}
