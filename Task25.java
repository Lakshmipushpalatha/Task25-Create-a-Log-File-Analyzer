import java.io.*;
import java.util.*;

public class Task25 {

    public static void main(String[] args) {

        String inputFile = "application.log";
        String reportFile = "log_report.txt";

        HashMap<String, Integer> counts = new HashMap<>();

        counts.put("INFO", 0);
        counts.put("WARNING", 0);
        counts.put("ERROR", 0);

        ArrayList<String> errorMessages = new ArrayList<>();

        int totalLines = 0;
        int malformedLines = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader(inputFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                totalLines++;

                String upperLine = line.toUpperCase();

                if (upperLine.contains("INFO")) {

                    counts.put("INFO", counts.get("INFO") + 1);

                } else if (upperLine.contains("WARNING")) {

                    counts.put("WARNING",
                            counts.get("WARNING") + 1);

                } else if (upperLine.contains("ERROR")) {

                    counts.put("ERROR", counts.get("ERROR") + 1);

                    errorMessages.add(line);

                } else {

                    malformedLines++;
                }
            }

            System.out.println("Log file processed successfully!");

        } catch (IOException e) {

            System.out.println("Error reading file: "
                    + e.getMessage());

            return;
        }

        System.out.println("\n===== LOG ANALYSIS REPORT =====");

        System.out.println("Total Lines: " + totalLines);

        System.out.println("INFO Messages: "
                + counts.get("INFO"));

        System.out.println("WARNING Messages: "
                + counts.get("WARNING"));

        System.out.println("ERROR Messages: "
                + counts.get("ERROR"));

        System.out.println("Malformed Lines: "
                + malformedLines);

        System.out.println("\n===== ERROR SUMMARY =====");

        if (errorMessages.isEmpty()) {

            System.out.println("No errors found.");

        } else {

            for (String error : errorMessages) {
                System.out.println(error);
            }
        }

        try (PrintWriter writer =
                new PrintWriter(new FileWriter(reportFile))) {

            writer.println("===== LOG ANALYSIS REPORT =====");

            writer.println("Total Lines: " + totalLines);

            writer.println("INFO Messages: "
                    + counts.get("INFO"));

            writer.println("WARNING Messages: "
                    + counts.get("WARNING"));

            writer.println("ERROR Messages: "
                    + counts.get("ERROR"));

            writer.println("Malformed Lines: "
                    + malformedLines);

            writer.println("\n===== ERROR SUMMARY =====");

            for (String error : errorMessages) {
                writer.println(error);
            }

            System.out.println("\nReport generated successfully!");
            System.out.println("Report saved in: " + reportFile);

        } catch (IOException e) {

            System.out.println("Error generating report: "
                    + e.getMessage());
        }
    }
}
