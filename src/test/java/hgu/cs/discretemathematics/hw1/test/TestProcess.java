package hgu.cs.discretemathematics.hw1.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class TestProcess {
	String input;
	boolean help;
	ArrayList<String> formula = new ArrayList<String>();

	public static void main(String[] args) {
		TestProcess my = new TestProcess();
		my.run(args);
	}

	private void run(String[] args) {
		Options options = createOptions();
		String line;

		if(parseOptions(options, args)) {
			if (help){
				printHelp(options);
				return;
			}

			try {
				/*
				InputStreamReader read = new InputStreamReader(new FileInputStream(input));
				BufferedReader b = new BufferedReader(read);

				while((buffer = b.readLine()) != null) formula.add(buffer);
				*/
				
				ProcessBuilder builder = new ProcessBuilder("./z3","./formula.txt");
				Process p = builder.start();
				p.waitFor();
				BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while((line = br.readLine())!=null) {
					System.out.println(line);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}

	}

	private boolean parseOptions(Options options, String[] args) {
		CommandLineParser parser = new DefaultParser();

		try {
			CommandLine cmd = parser.parse(options, args);

			input = cmd.getOptionValue("i");

		}catch (Exception e) {
			printHelp(options);
			return false;
		}
		return true;
	}

	private void printHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		String header = "PuzzleSolver";
		String footer ="\nhttps://github.com/lamb0711/PuzzleSolver";
		formatter.printHelp("Sudoku, kakurasu, 3-in-row Solver", header, options, footer, true);
	}

	private Options createOptions() {
		Options options = new Options();

		options.addOption(Option.builder("i").longOpt("path")
				.desc("Save a path of input file name")
				.hasArg()
				.argName("Input file name")
				.required()
				.build());
		options.addOption(Option.builder("h").longOpt("help")
				.desc("Help")
				.build());

		return options;	
	}



}
