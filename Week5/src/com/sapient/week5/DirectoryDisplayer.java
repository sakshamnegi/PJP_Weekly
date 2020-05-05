package com.sapient.week5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DirectoryDisplayer {

	public static void main(String[] args) {
		String dir;
		System.out.println("Enter directory ");
		dir = CustomHelper.read.nextLine();
		Path path = Paths.get(dir);
		try {
			List<String> fileList = Files.walk(path).filter(Files::isRegularFile).map(x -> x.toString())
					.collect(Collectors.toList());
			for (String file : fileList) {
				System.out.println(file);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
