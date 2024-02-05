package programmesweek9;
/*10. Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prog_10_PrintZoneStations {
    public static void main(String[] args) {
        //Create a HashMap to store station-line mappings for zone 1 stations

        Map<String, String> stationLines = new HashMap<>();
        stationLines.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationLines.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        stationLines.put("Paddington", "Bakerloo, Circle, District, Hammersmith & City");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a Zone 1 station name (or type 'exit' to quit):");
            String stationName = scanner.nextLine();
            if (stationName.equalsIgnoreCase("exit")) {
                break;
            }
            String lines = stationLines.get(stationName);

            if (lines != null) {
                System.out.println("The following lines pass through " + stationName + " : " + lines);
            } else {
                System.out.println("The Station" + stationName + " is not in Zone 1 ");
            }
        }
    }
}
