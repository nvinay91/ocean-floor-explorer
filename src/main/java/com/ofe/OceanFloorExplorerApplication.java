package com.ofe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OceanFloorExplorerApplication {

	public static void main(String[] args) {
//		System.out.println("=== Application Starting ===");
//		printNotes();
//		printGrid(5);
		SpringApplication.run(OceanFloorExplorerApplication.class, args);
	}

	private static void printNotes() {
		try (InputStream is = new OceanFloorExplorerApplication().getClass().getResourceAsStream("/README.md")) {

			new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)).lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void printGrid(int size) {
		for (int y = size - 1; y >= 0; y--) {

			// Print row of coordinates
			for (int x = 0; x < size; x++) {
				System.out.print("(" + x + "," + y + ")");
				if (x < size - 1) {
					System.out.print(" ── ");
				}
			}
			System.out.println();

			// Print vertical connectors (except last row)
			if (y > 0) {
				for (int x = 0; x < size; x++) {
					System.out.print("  │     ");
				}
				System.out.println();
			}
		}
	}

}
