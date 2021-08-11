package com.hoolululu;

import org.apache.commons.cli.*;

/**
 * This project demo the basic usage of the
 */
public class CmdLineToolExample {
    public static void main(String[] args) {
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();

        // Declare all the support command arguments here in the option list;
        options.addOption("h", "help", false, "Help information.");
        options.addOption("s", "scale", true, "Scale factor");

        //The following code is used to parse the given input arguments from users
        try {
            CommandLine commandLine = parser.parse(options, args);
            if (commandLine.hasOption('h')) {
                System.out.print("Usage : \n" +
                        "-h : print help information \n" +
                        "-s : scale factor of generated data, unit : GB \n" +
                        "-r : number of rows of the smallest size of table, other tables will be scaled accordingly \n" +
                        "-f : format of the generated data, support json, txt, orc, parquet \n");
                System.exit(0);
            }
            // The above code is used to detect the option argument and implement the function accordingly.
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
